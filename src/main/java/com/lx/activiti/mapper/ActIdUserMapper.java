package com.lx.activiti.mapper;

import com.lx.activiti.dto.ActIdUser;

public interface ActIdUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActIdUser record);

    int insertSelective(ActIdUser record);

    ActIdUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActIdUser record);

    int updateByPrimaryKey(ActIdUser record);
}