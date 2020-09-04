package com.zl.dao;

import com.zl.domain.AccountInformation;
import com.zl.domain.AccountInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountInformationMapper {
    long countByExample(AccountInformationExample example);

    int deleteByExample(AccountInformationExample example);

    int deleteByPrimaryKey(Integer accountId);

    int insert(AccountInformation record);

    int insertSelective(AccountInformation record);

    List<AccountInformation> selectByExample(AccountInformationExample example);

    AccountInformation selectByPrimaryKey(Integer accountId);

    int updateByExampleSelective(@Param("record") AccountInformation record, @Param("example") AccountInformationExample example);

    int updateByExample(@Param("record") AccountInformation record, @Param("example") AccountInformationExample example);

    int updateByPrimaryKeySelective(AccountInformation record);

    int updateByPrimaryKey(AccountInformation record);
}