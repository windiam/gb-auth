package com.genebook.auth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.genebook.auth.entity.SysUserEntity;
import com.genebook.auth.entity.SysUserExample;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserEntity record);

    int insertSelective(SysUserEntity record);

    List<SysUserEntity> selectByExample(SysUserExample example);

    SysUserEntity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUserEntity record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUserEntity record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUserEntity record);

    int updateByPrimaryKey(SysUserEntity record);
}