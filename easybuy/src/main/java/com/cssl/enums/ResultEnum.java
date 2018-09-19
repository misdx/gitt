package com.cssl.enums;

import lombok.Getter;

/**
 * Created by MBENBEN on 2018/9/4.
 */
@Getter
public enum ResultEnum {
    // 商品异常
    INSERT_PRODUCT_ERROR(1,"商品新增失败"),
    //USER_LOGIN_ERROR(2,""),

    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
