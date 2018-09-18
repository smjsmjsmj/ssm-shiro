package com.ssm.dao;

import com.ssm.entity.Permission;

public interface PermissionMapper {

    int insert(Permission record);

    int insertSelective(Permission record);
}	