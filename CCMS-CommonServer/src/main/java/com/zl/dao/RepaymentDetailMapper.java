package com.zl.dao;

import com.zl.domain.RepaymentDetail;
import com.zl.domain.RepaymentDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RepaymentDetailMapper {
    long countByExample(RepaymentDetailExample example);

    int deleteByExample(RepaymentDetailExample example);

    int deleteByPrimaryKey(Long repaymentDetailId);

    int insert(RepaymentDetail record);

    int insertSelective(RepaymentDetail record);

    List<RepaymentDetail> selectByExample(RepaymentDetailExample example);

    RepaymentDetail selectByPrimaryKey(Long repaymentDetailId);

    int updateByExampleSelective(@Param("record") RepaymentDetail record, @Param("example") RepaymentDetailExample example);

    int updateByExample(@Param("record") RepaymentDetail record, @Param("example") RepaymentDetailExample example);

    int updateByPrimaryKeySelective(RepaymentDetail record);

    int updateByPrimaryKey(RepaymentDetail record);
}