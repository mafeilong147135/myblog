package com.mfl.myblog.service.security;

import com.mfl.myblog.model.entity.SysRole;
import com.mfl.myblog.model.entity.SysUser;
import com.mfl.myblog.model.entity.SysUserRole;
import com.mfl.myblog.service.permission.SysRoleService;
import com.mfl.myblog.service.permission.SysUserRoleService;
import com.mfl.myblog.service.permission.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private SysUserService userService;

    @Autowired
    private SysRoleService roleService;

    @Autowired
    private SysUserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息
        SysUser user = this.userService.selectByName(username);
        // 判断用户是否存在
        if(null == user) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        // 添加权限
        List<SysUserRole> userRoles = this.userRoleService.listByUserId(user.getId());
        for (SysUserRole userRole : userRoles) {
            SysRole role = this.roleService.selectById(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        // 返回UserDetails实现类
        return new User(user.getName(), user.getPassword(), authorities);
    }
}
