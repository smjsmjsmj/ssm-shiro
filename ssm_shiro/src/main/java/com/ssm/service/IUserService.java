package com.ssm.service;

import java.util.Set;

import com.ssm.entity.Users;

public interface IUserService {
	public Users getUserById(int userId);
	
	public Set<String> findRoles(String userName);
	
	public Set<String> findPermissions(String userName);
	
	public Users getUserByName(String userName);
	
}
