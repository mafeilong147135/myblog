package com.mfl.myblog.service.permission;

import com.mfl.myblog.model.entity.SysUserRole;

import java.util.List;

public interface SysUserRoleService {

    List<SysUserRole> listByUserId(Integer userId);
}
