package com.zl.controller;

import com.zl.domain.CreditCard;
import com.zl.util.OAFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OAController {
    @Autowired
    private OAFeignClient oaFeignClient;

    @GetMapping("/oabasicinfo")
    public String oabasicinfo() {
        return "oabasicinfo";
    }

    @PostMapping("/insertOAbasicinfo")
    public String insertStaging(CreditCard creditCard){

        return "oaunitinfo";
    }
}
