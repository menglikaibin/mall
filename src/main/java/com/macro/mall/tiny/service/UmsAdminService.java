package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.UmsAdmin;
import com.macro.mall.tiny.mbg.model.UmsPermission;

import java.util.List;

/**
 * 后台管理员service
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
