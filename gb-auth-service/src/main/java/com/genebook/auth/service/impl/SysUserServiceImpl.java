package com.genebook.auth.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genebook.auth.dto.SysUserDTO;
import com.genebook.auth.mapper.SysUserMapper;
import com.genebook.auth.service.SysUserService;

@Service(value="sysUserService")
public class SysUserServiceImpl implements SysUserService{
	
	private final Logger logger = Logger.getLogger(SysUserServiceImpl.class);

	@Autowired
	private SysUserMapper sysUserMappr;

	@Override
	public SysUserDTO queryByUsername(String username) {
		// TODO Auto-generated method stub
		logger.info("--------------------------->根据用户名查询");
		System.out.println("--------------------------->根据用户名查询");
		return null;
	}
	
}
