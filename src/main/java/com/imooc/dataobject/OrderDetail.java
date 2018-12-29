package com.imooc.dataobject;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author yxl
 * @date 2018-12-18 14:15
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    private String orderId; //订单id

    private String productId; //商品ID

    private String productName; //商品名字

    private BigDecimal productPrice; //单价

    private Integer productQuantity; //数量

    private String productIcon; //小图


}
