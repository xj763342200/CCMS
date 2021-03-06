package com.zl.dao;

import com.zl.domain.HaveTheBill;
import com.zl.domain.HaveTheBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaveTheBillMapper {
    long countByExample(HaveTheBillExample example);

    int deleteByExample(HaveTheBillExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(HaveTheBill record);

    int insertSelective(HaveTheBill record);

    List<HaveTheBill> selectByExample(HaveTheBillExample example);

    HaveTheBill selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") HaveTheBill record, @Param("example") HaveTheBillExample example);

    int updateByExample(@Param("record") HaveTheBill record, @Param("example") HaveTheBillExample example);

    int updateByPrimaryKeySelective(HaveTheBill record);

    int updateByPrimaryKey(HaveTheBill record);
}