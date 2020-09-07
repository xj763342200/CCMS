package com.zl.controller;
import java.util.Date;

import com.alibaba.fastjson.JSONObject;
import com.zl.domain.CreditCard;
import com.zl.domain.Result;
import com.zl.service.OAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zl")
public class OAController {
    @Autowired
    private OAService oaService;

    @PostMapping("/insertOAbasicinfo")
    public Result insertOAbasicinfo(@RequestBody CreditCard creditCard) {
        return oaService.insertOAbasicinfo(creditCard);
    }
}
