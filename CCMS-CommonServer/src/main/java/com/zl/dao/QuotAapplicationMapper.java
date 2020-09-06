package com.zl.dao;

import com.zl.domain.QuotAapplication;
import com.zl.domain.QuotAapplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuotAapplicationMapper {
    long countByExample(QuotAapplicationExample example);

    int deleteByExample(QuotAapplicationExample example);

    int deleteByPrimaryKey(Integer quotId);

    int insert(QuotAapplication record);

    int insertSelective(QuotAapplication record);

    List<QuotAapplication> selectByExample(QuotAapplicationExample example);

    QuotAapplication selectByPrimaryKey(Integer quotId);

    int updateByExampleSelective(@Param("record") QuotAapplication record, @Param("example") QuotAapplicationExample example);

    int updateByExample(@Param("record") QuotAapplication record, @Param("example") QuotAapplicationExample example);

    int updateByPrimaryKeySelective(QuotAapplication record);

    int updateByPrimaryKey(QuotAapplication record);
}