package com.mfl.myblog.service.permission.impl;

import com.mfl.myblog.mapper.SysUserRoleMapper;
import com.mfl.myblog.model.entity.SysUserRole;
import com.mfl.myblog.service.permission.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class SysUserRoleServiceImpl implements SysUserRoleService {

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public List<SysUserRole> listByUserId(Integer userId) {
        List<SysUserRole> list = this.sysUserRoleMapper.listByUserId(userId);
        return list;
    }
}
