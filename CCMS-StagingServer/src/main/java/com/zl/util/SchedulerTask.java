package com.zl.util;

import com.zl.service.StagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {

    @Autowired
    private StagingService stagingService;

    private int count=1;

    /**
     * 每月生成已出账单，并发送短信
     */
    //表示每月三号17:15生成账单，并给用户发送短信
    @Scheduled(cron = "0 3 17 15 * ?")
    //每隔六秒
    //@Scheduled(cron = "*/6 * * * * ?")
    private void proces(){
        Boolean flag = stagingService.sendMessage();
        if (flag){
            String content="springboot整合定时器实现短信发送，这是第"+(count++)+"条短信";
            System.out.println(content);
        }
    }
}
