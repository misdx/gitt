package com.cssl.enums;

import lombok.Getter;

/**
 * 用户状态
 * Created by MBENBEN on 2018/9/4.
 */
@Getter
public enum UserStatusEnum {

    ADMIN(0, "管理员"),
    COMMON(1, "普通用户"),
    CONTRABAND(2, "违禁用户"),;

    private Integer code;
    private String msg;

    UserStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
