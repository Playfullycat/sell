package com.imooc.enums;

import lombok.Getter;

/**
 * @author yxl
 * @date 2018-12-18 14:12
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "未支付"),
    SUCCESS(1, "支付成功")
    ;


    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }}
