package com.lx.activiti.mapper;

import com.lx.activiti.dto.ActIdMembershipKey;

public interface ActIdMembershipMapper {
    int deleteByPrimaryKey(ActIdMembershipKey key);

    int insert(ActIdMembershipKey record);

    int insertSelective(ActIdMembershipKey record);
}