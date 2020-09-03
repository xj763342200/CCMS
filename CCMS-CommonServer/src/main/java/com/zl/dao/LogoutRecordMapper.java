package com.zl.dao;

import com.zl.domain.LogoutRecord;
import com.zl.domain.LogoutRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LogoutRecordMapper {
    long countByExample(LogoutRecordExample example);

    int deleteByExample(LogoutRecordExample example);

    int deleteByPrimaryKey(Integer logoutId);

    int insert(LogoutRecord record);

    int insertSelective(LogoutRecord record);

    List<LogoutRecord> selectByExample(LogoutRecordExample example);

    LogoutRecord selectByPrimaryKey(Integer logoutId);

    int updateByExampleSelective(@Param("record") LogoutRecord record, @Param("example") LogoutRecordExample example);

    int updateByExample(@Param("record") LogoutRecord record, @Param("example") LogoutRecordExample example);

    int updateByPrimaryKeySelective(LogoutRecord record);

    int updateByPrimaryKey(LogoutRecord record);
}