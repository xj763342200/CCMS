package com.zl.service.impl;

import com.zl.dao.CreditCardMapper;
import com.zl.domain.CreditCard;
import com.zl.domain.Result;
import com.zl.service.OAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OAServiceImpl implements OAService {
    @Autowired
    private CreditCardMapper creditCardMapper;

    @Override
    public Result insertOAbasicinfo(CreditCard creditCard) {
        int flag = creditCardMapper.insertSelective(creditCard);
        if (flag>0){
            return new Result(200,"添加成功",null);
        }else {
            return new Result(400,"添加失败",null);
        }
    }
}
