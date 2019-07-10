package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PersistentLogins {

  private String username;

  private String series;

  private String token;

  private Date lastUsed;

}
