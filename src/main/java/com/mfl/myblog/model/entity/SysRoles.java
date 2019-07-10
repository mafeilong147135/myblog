package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SysRoles {

  private String roleId;

  private String roleName;

  private String roleDesc;

  private Integer enable;

  private Integer isSys;

  private String moduleId;

}
