package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class SysUsers {

  private String userId;

  private String username;

  private String name;

  private String password;

  private Date dtCreate;

  private Date lastLogin;

  private Date deadline;

  private String loginIp;

  private String vQzjgid;

  private String vQzjgmc;

  private String depId;

  private String depName;

  private Integer enabled;

  private Integer accountNonExpired;

  private Integer accountNonLocked;

  private Integer credentialsNonExpired;
}
