package com.zl.dao;

import com.zl.domain.SupportingRecord;
import com.zl.domain.SupportingRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SupportingRecordMapper {
    long countByExample(SupportingRecordExample example);

    int deleteByExample(SupportingRecordExample example);

    int deleteByPrimaryKey(Integer supportingId);

    int insert(SupportingRecord record);

    int insertSelective(SupportingRecord record);

    List<SupportingRecord> selectByExample(SupportingRecordExample example);

    SupportingRecord selectByPrimaryKey(Integer supportingId);

    int updateByExampleSelective(@Param("record") SupportingRecord record, @Param("example") SupportingRecordExample example);

    int updateByExample(@Param("record") SupportingRecord record, @Param("example") SupportingRecordExample example);

    int updateByPrimaryKeySelective(SupportingRecord record);

    int updateByPrimaryKey(SupportingRecord record);
}