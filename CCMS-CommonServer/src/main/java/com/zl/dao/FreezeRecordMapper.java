package com.zl.dao;

import com.zl.domain.FreezeRecord;
import com.zl.domain.FreezeRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FreezeRecordMapper {
    long countByExample(FreezeRecordExample example);

    int deleteByExample(FreezeRecordExample example);

    int deleteByPrimaryKey(Integer freezeId);

    int insert(FreezeRecord record);

    int insertSelective(FreezeRecord record);

    List<FreezeRecord> selectByExample(FreezeRecordExample example);

    FreezeRecord selectByPrimaryKey(Integer freezeId);

    int updateByExampleSelective(@Param("record") FreezeRecord record, @Param("example") FreezeRecordExample example);

    int updateByExample(@Param("record") FreezeRecord record, @Param("example") FreezeRecordExample example);

    int updateByPrimaryKeySelective(FreezeRecord record);

    int updateByPrimaryKey(FreezeRecord record);
}