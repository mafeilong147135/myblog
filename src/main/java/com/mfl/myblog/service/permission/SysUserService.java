package com.mfl.myblog.service.permission;

import com.mfl.myblog.model.entity.SysUser;

public interface SysUserService {

    SysUser selectById(Integer id);

    SysUser selectByName(String name);

}
