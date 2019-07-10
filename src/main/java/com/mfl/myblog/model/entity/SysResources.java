package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SysResources {

  private String resourceId;

  private String resourceType;

  private String resourceName;

  private String resourceDesc;

  private String resourcePath;

  private String priority;

  private Integer enable;

  private Integer isSys;

  private String moduleId;
}
