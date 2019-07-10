package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SysAuthoritiesResources {

  private String id;

  private String resourceId;

  private String authorityId;
}
