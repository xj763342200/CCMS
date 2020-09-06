package com.zl.dao;

import com.zl.domain.CardManagement;
import com.zl.domain.CardManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardManagementMapper {
    long countByExample(CardManagementExample example);

    int deleteByExample(CardManagementExample example);

    int deleteByPrimaryKey(Integer cardId);

    int insert(CardManagement record);

    int insertSelective(CardManagement record);

    List<CardManagement> selectByExample(CardManagementExample example);

    CardManagement selectByPrimaryKey(Integer cardId);

    List<CardManagement> selectByPrimaryKeyList(Integer userId);

    CardManagement queryCardManagement(CardManagement cardManagement);

    int updateByExampleSelective(@Param("record") CardManagement record, @Param("example") CardManagementExample example);

    int updateByExample(@Param("record") CardManagement record, @Param("example") CardManagementExample example);

    int updateByPrimaryKeySelective(CardManagement record);

    int updateByPrimaryKey(CardManagement record);
}