package com.mfl.myblog.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SysUsersRoles {

  /** 标识 */
  private String id;
  /** 角色ID */
  private String roleId;
  /** 用户ID */
  private String userId;

}
