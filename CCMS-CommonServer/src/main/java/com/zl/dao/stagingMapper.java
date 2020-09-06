package com.zl.dao;

import com.zl.domain.staging;
import com.zl.domain.stagingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface stagingMapper {
    long countByExample(stagingExample example);

    int deleteByExample(stagingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(staging record);

    int insertSelective(staging record);

    List<staging> selectByExample(stagingExample example);

    staging selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") staging record, @Param("example") stagingExample example);

    int updateByExample(@Param("record") staging record, @Param("example") stagingExample example);

    int updateByPrimaryKeySelective(staging record);

    int updateByPrimaryKey(staging record);
}