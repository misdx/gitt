package com.cssl.exception;

import com.cssl.enums.ResultEnum;

/**
 * 自定义异常
 * Created by MBENBEN on 2018/9/4.
 */
public class EasybuyException extends RuntimeException {

    private Integer code;

    public EasybuyException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public EasybuyException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
