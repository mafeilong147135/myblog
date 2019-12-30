package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SysUser implements Serializable {

    private static final long serialVersionUID = -8922348349105043646L;

    private Integer id;

    private String name;

    private String password;

}

