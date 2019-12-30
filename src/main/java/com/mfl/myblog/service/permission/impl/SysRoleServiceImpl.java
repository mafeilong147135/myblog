package com.mfl.myblog.service.permission.impl;

import com.mfl.myblog.mapper.SysRoleMapper;
import com.mfl.myblog.model.entity.SysRole;
import com.mfl.myblog.service.permission.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public SysRole selectById(Integer id) {
        return this.sysRoleMapper.selectById(id);
    }
}
