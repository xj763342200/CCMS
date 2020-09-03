package com.zl.dao;

import com.zl.domain.BillDetails;
import com.zl.domain.BillDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillDetailsMapper {
    long countByExample(BillDetailsExample example);

    int deleteByExample(BillDetailsExample example);

    int deleteByPrimaryKey(Long billDetailsId);

    int insert(BillDetails record);

    int insertSelective(BillDetails record);

    List<BillDetails> selectByExample(BillDetailsExample example);

    BillDetails selectByPrimaryKey(Long billDetailsId);

    int updateByExampleSelective(@Param("record") BillDetails record, @Param("example") BillDetailsExample example);

    int updateByExample(@Param("record") BillDetails record, @Param("example") BillDetailsExample example);

    int updateByPrimaryKeySelective(BillDetails record);

    int updateByPrimaryKey(BillDetails record);
}