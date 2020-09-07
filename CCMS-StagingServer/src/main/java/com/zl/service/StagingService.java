package com.zl.service;

import com.zl.domain.Result;
import com.zl.domain.staging;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StagingService {

    public List<staging> selectAllStaging();

    public Result insertStaging(staging sta);

    public List<staging> selectAllStagingByDateY();

    public List<staging> selectAllStagingByDateN();

    public staging stagingInfo(Integer id);

    public Boolean sendMessage();


}
