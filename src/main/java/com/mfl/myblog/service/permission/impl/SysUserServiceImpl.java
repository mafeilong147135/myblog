package com.mfl.myblog.service.permission.impl;

import com.mfl.myblog.mapper.SysUserMapper;
import com.mfl.myblog.model.entity.SysUser;
import com.mfl.myblog.service.permission.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectById(Integer id) {
        return this.sysUserMapper.selectById(id);
    }

    @Override
    public SysUser selectByName(String name) {
        return this.sysUserMapper.selectByName(name);
    }
}
