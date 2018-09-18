package com.ssm.dao;

import com.ssm.entity.Roles;

public interface RolesMapper {

    int insert(Roles record);

    int insertSelective(Roles record);

}