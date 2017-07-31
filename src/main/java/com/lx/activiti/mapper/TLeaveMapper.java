package com.lx.activiti.mapper;

import com.lx.activiti.dto.TLeave;

public interface TLeaveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TLeave record);

    int insertSelective(TLeave record);

    TLeave selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TLeave record);

    int updateByPrimaryKeyWithBLOBs(TLeave record);

    int updateByPrimaryKey(TLeave record);
}