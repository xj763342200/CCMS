package com.zl.controller;

import com.zl.domain.Result;
import com.zl.domain.staging;
import com.zl.service.StagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/zl")
public class StagingController {
    @Autowired
    private StagingService stagingService;

    @RequestMapping(value = "stagingAll",method = RequestMethod.GET)
    public List<staging> stagingAll(){
        return stagingService.selectAllStaging();
    }

    @RequestMapping(value = "insertStaging",method = RequestMethod.POST)
    public Result insertStaging(@RequestBody staging sta){
        return stagingService.insertStaging(sta);
    }

    @RequestMapping(value = "stagingAllStagingByDateY",method = RequestMethod.GET)
    public List<staging> stagingAllStagingByDateY(){
        return stagingService.selectAllStagingByDateY();
    }

    @RequestMapping(value = "stagingAllStagingByDateN",method = RequestMethod.GET)
    public List<staging> stagingAllStagingByDateN(){
        return stagingService.selectAllStagingByDateN();
    }

    @RequestMapping(value = "staginginfo/{id}",method = RequestMethod.GET)
    public staging staginginfo(@PathVariable("id") Integer id){
        return stagingService.stagingInfo(id);
    }
}
