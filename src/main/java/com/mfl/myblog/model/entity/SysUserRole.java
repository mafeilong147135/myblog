package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 802001171819280650L;

    private Integer userId;

    private Integer roleId;

}
