package com.mfl.myblog.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SysRole implements Serializable {

    private static final long serialVersionUID = 6401238730986510116L;

    private Integer id;

    private String name;
}
