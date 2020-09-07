package com.zl.controller;


import com.zl.domain.Result;
import com.zl.domain.staging;
import com.zl.util.StagingFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class StagingController {
    @Autowired
    private StagingFeignClient stagingFeignClient;

    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("aging")
    public String aging(){
        return "aging";
    }

    @ResponseBody
    @PostMapping("stagingmoneyn")
    public Boolean stagingmoneyn(String Stagingmoney){
        Integer num = 5000;//账户总额度
        Double xinyonge = 0.9;//可分期百分比
        //由于没有拿到账户额度，数据模拟
        System.out.println(Stagingmoney);
        int money = new Integer(Stagingmoney);
        System.out.println(money);
        if (money>1000 && money<4500){
            return true;
        }else {
            return false;
        }
    }

    @ResponseBody
    @PostMapping("showbalance")
    public String showbalance(Integer accid,Double Stagingmoney) {
        //初始化手续费,三期0.165% 六期：0.36% 十二期：0.72% 二十四期：1.56%
        Double should = 0.0;
        //分期期数
        int shounum = 0;
        if (accid==3){
            should = 0.00165;
            shounum = 3;
        }else if (accid==6){
            should = 0.0036;
            shounum = 6;
        }else if (accid==12){
            should = 0.0072;
            shounum = 12;
        }else if (accid==24){
            should = 0.0156;
            shounum = 24;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        String shou = df.format((should*shounum*Stagingmoney+Stagingmoney)/shounum);
        return shou;
    }

    @GetMapping("/stagingAll")
    public String stagingAll(Model model){
        List<staging> stagings =stagingFeignClient.stagingAll();
        model.addAttribute("stagings",stagings);
        return "staging";
    }

    @GetMapping("/selectAllStagingByDateY")
    public String selectAllStagingByDateY(Model model){
        List<staging> stagings =stagingFeignClient.selectAllStagingByDateY();
        model.addAttribute("stagings",stagings);
        return "staging";
    }

    @GetMapping("/selectAllStagingByDateN")
    public String selectAllStagingByDateN(Model model){
        List<staging> stagings =stagingFeignClient.selectAllStagingByDateN();
        model.addAttribute("stagings",stagings);
        return "staging";
    }

    @GetMapping("/staginginfo")
    public String stagingInfo(String id,Model model){
        staging sta = stagingFeignClient.staginginfo(new Integer(id));
        List<String> dates = new ArrayList<String>();
        for (int i = 1;i<=sta.getTotalmonth();i++){
            if (i+9<=12){
                String date = "2020."+(i+9)+".03";
                dates.add(date);
            }else if (i+9<=24 && i+9>12){
                String date = "2021."+(i-3)+".03";
                dates.add(date);
            }else {
                String date = "2022."+(i-15)+".03";
                dates.add(date);
            }
        }
        model.addAttribute("dates",dates);
        model.addAttribute("staging",sta);
        return "staginginfo";
    }

    @PostMapping("/insertStaging")
    public String insertStaging(String zongmoney,staging sta, Model model){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置每期手续费
        sta.setRate(sta.getMonthsend()-(new Double(sta.getTotalmoney())/sta.getTotalmonth()));
        //模拟当前分期信用卡id，卡号应该从前台页面获取
        sta.setCredId(1001);

        //设置初始化分期数据
        sta.setCreatetime(new Date());
        sta.setUpdatetime(new Date());
        sta.setEndsendMonthnum(0);
        sta.setRemindnum(0);
        sta.setIfDelete(0);
        sta.setSurplusmoney(sta.getMonthsend()*sta.getTotalmonth());
        sta.setSurplusmonth(sta.getTotalmonth());

        //插入数据
        Result result = stagingFeignClient.insertStaging(sta);
        model.addAttribute("id",sta.getId());
        model.addAttribute("dimoney",new Integer(zongmoney)-sta.getTotalmoney());

        return "state";
    }
}
