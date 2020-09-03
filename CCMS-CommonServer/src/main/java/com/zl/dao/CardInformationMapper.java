package com.zl.dao;

import com.zl.domain.CardInformation;
import com.zl.domain.CardInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardInformationMapper {
    long countByExample(CardInformationExample example);

    int deleteByExample(CardInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CardInformation record);

    int insertSelective(CardInformation record);

    List<CardInformation> selectByExample(CardInformationExample example);

    CardInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CardInformation record, @Param("example") CardInformationExample example);

    int updateByExample(@Param("record") CardInformation record, @Param("example") CardInformationExample example);

    int updateByPrimaryKeySelective(CardInformation record);

    int updateByPrimaryKey(CardInformation record);
}