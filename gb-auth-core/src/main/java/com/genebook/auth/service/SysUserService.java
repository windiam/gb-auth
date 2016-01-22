package com.genebook.auth.service;

import com.genebook.auth.dto.SysUserDTO;

public interface SysUserService {

	public SysUserDTO queryByUsername(String username);
}
