package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author yxl
 * @date 2018-12-18 20:35
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
    }
}
