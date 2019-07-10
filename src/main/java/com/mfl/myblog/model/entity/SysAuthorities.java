package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SysAuthorities {

  private String authorityId;

  private String authorityMark;

  private String authorityName;

  private String authorityDesc;

  private String message;

  private Integer enable;

  private Integer isSys;

  private String moduleId;

}
