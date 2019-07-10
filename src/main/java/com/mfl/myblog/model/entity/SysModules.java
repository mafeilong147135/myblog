package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SysModules {

  private String moduleId;

  private String moduleName;

  private String moduleDesc;

  private String moduleType;

  private String parent;

  private String moduleUrl;

  private Integer iLevel;

  private Integer leaf;

  private String application;

  private String controller;

  private Integer enable;

  private Integer priority;
}
