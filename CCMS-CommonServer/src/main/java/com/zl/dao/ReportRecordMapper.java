package com.zl.dao;

import com.zl.domain.ReportRecord;
import com.zl.domain.ReportRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportRecordMapper {
    long countByExample(ReportRecordExample example);

    int deleteByExample(ReportRecordExample example);

    int deleteByPrimaryKey(Integer reportId);

    int insert(ReportRecord record);

    int insertSelective(ReportRecord record);

    List<ReportRecord> selectByExample(ReportRecordExample example);

    ReportRecord selectByPrimaryKey(Integer reportId);

    int updateByExampleSelective(@Param("record") ReportRecord record, @Param("example") ReportRecordExample example);

    int updateByExample(@Param("record") ReportRecord record, @Param("example") ReportRecordExample example);

    int updateByPrimaryKeySelective(ReportRecord record);

    int updateByPrimaryKey(ReportRecord record);
}