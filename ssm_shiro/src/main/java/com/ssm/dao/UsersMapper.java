package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Permission;
import com.ssm.entity.Roles;
import com.ssm.entity.Users;

public interface UsersMapper {

    int insert(Users record);

    int insertSelective(Users record);
    
    Users getUserByName(String name);
    
    List<Roles> findRoles(String name);
    List<Permission> findPermissions(String name);
}