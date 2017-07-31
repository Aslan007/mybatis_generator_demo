package com.lx.activiti.mapper;

import com.lx.activiti.dto.ActIdGroup;

public interface ActIdGroupMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActIdGroup record);

    int insertSelective(ActIdGroup record);

    ActIdGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActIdGroup record);

    int updateByPrimaryKey(ActIdGroup record);
}