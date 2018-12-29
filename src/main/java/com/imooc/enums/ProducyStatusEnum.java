package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 *
 * @author yxl
 * @date 2018-12-17 14:37
 */
@Getter
public enum ProducyStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");
    private Integer code;
    private String message;

    ProducyStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
