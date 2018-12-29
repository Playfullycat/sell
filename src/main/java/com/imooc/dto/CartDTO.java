package com.imooc.dto;

import lombok.Data;

/**
 * @author yxl
 * @date 2018-12-18 21:45
 */
@Data
public class CartDTO {
    /*商品ID*/
    private String productId;
    /*数量*/
    private Integer productQuanTity;

    public CartDTO(String productId, Integer productQuanTity) {
        this.productId = productId;
        this.productQuanTity = productQuanTity;
    }
}
