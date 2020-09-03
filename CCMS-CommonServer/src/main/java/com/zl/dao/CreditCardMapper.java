package com.zl.dao;

import com.zl.domain.CreditCard;
import com.zl.domain.CreditCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditCardMapper {
    long countByExample(CreditCardExample example);

    int deleteByExample(CreditCardExample example);

    int deleteByPrimaryKey(String id);

    int insert(CreditCard record);

    int insertSelective(CreditCard record);

    List<CreditCard> selectByExample(CreditCardExample example);

    CreditCard selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CreditCard record, @Param("example") CreditCardExample example);

    int updateByExample(@Param("record") CreditCard record, @Param("example") CreditCardExample example);

    int updateByPrimaryKeySelective(CreditCard record);

    int updateByPrimaryKey(CreditCard record);
}