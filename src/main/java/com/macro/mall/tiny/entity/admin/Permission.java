package com.macro.mall.tiny.entity.admin;

import java.util.ArrayList;
import java.util.List;

public class Permission {
    protected Long id;

    protected String name;

    protected Long pid;

    protected List<Permission> childrenPermission = new ArrayList<>();

    public void addChildrenPermission(Permission permission) {
        childrenPermission.add(permission);
    }

    public List<Permission> getChildrenPermission() {
        if (childrenPermission.size() <= 0) {
            return null;
        }

        return childrenPermission;
    }
}
