package com.zl.service.impl;

import com.zl.dao.stagingMapper;
import com.zl.domain.Result;
import com.zl.domain.staging;
import com.zl.service.StagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StagingServiceimpl implements StagingService {
    @Autowired
    private stagingMapper staging;


    @Override
    public List<staging> selectAllStaging() {
        return staging.selectByExample(null);
    }

    @Override
    public Result insertStaging(staging sta) {
        int flag = staging.insert(sta);
        if (flag>0){
            return new Result(200,"添加成功",null);
        }else {
            return new Result(400,"添加失败",null);
        }
    }

    @Override
    public List<staging> selectAllStagingByDateY() {
        return staging.selectAllStagingByDateY();
    }

    @Override
    public List<staging> selectAllStagingByDateN() {
        return staging.selectAllStagingByDateN();
    }

    @Override
    public com.zl.domain.staging stagingInfo(Integer id) {
        return staging.staginginfo(id);
    }

    @Override
    public Boolean sendMessage() {
        return true;
    }
}
