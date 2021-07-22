package com.macro.mall.tiny.entity.admin;

import lombok.Data;

import java.util.List;

@Data
public class AdminInfo {
    protected Long id;

    protected String username;

    protected String email;

    protected String nickName;

    protected List<Permission> permissions;
}
