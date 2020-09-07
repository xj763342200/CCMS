package com.zl.util;

import com.zl.domain.Result;
import com.zl.domain.staging;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "StagingServer")
public interface StagingFeignClient {
    @RequestMapping(value = "/zl/stagingAll",method = RequestMethod.GET)
    public List<staging> stagingAll();

    @RequestMapping(value = "/zl/insertStaging",method = RequestMethod.POST)
    public Result insertStaging(staging sta);

    @RequestMapping(value = "zl/stagingAllStagingByDateY",method = RequestMethod.GET)
    public List<staging> selectAllStagingByDateY();

    @RequestMapping(value = "zl/stagingAllStagingByDateN",method = RequestMethod.GET)
    public List<staging> selectAllStagingByDateN();

    @RequestMapping(value = "zl/staginginfo/{id}",method = RequestMethod.GET)
    public staging staginginfo(@PathVariable("id") Integer id);
}
