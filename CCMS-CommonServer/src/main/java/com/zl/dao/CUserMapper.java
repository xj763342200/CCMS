package com.zl.dao;

import com.zl.domain.CUser;
import com.zl.domain.CUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CUserMapper {
    long countByExample(CUserExample example);

    int deleteByExample(CUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(CUser record);

    int insertSelective(CUser record);

    List<CUser> selectByExample(CUserExample example);

    CUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") CUser record, @Param("example") CUserExample example);

    int updateByExample(@Param("record") CUser record, @Param("example") CUserExample example);

    int updateByPrimaryKeySelective(CUser record);

    int updateByPrimaryKey(CUser record);
}