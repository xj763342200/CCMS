package com.zl.util;

import com.zl.domain.CreditCard;
import com.zl.domain.Result;
import com.zl.domain.staging;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "OAServer")
public interface OAFeignClient {
    @RequestMapping(value = "/zl/insertOAbasicinfo",method = RequestMethod.POST)
    public Result insertOAbasicinfo(@RequestBody CreditCard creditCard);
}
