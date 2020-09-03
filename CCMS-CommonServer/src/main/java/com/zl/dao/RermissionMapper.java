package com.zl.dao;

import com.zl.domain.Rermission;
import com.zl.domain.RermissionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RermissionMapper {
    long countByExample(RermissionExample example);

    int deleteByExample(RermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rermission record);

    int insertSelective(Rermission record);

    List<Rermission> selectByExample(RermissionExample example);

    Rermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rermission record, @Param("example") RermissionExample example);

    int updateByExample(@Param("record") Rermission record, @Param("example") RermissionExample example);

    int updateByPrimaryKeySelective(Rermission record);

    int updateByPrimaryKey(Rermission record);
}