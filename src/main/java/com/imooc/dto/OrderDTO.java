package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import lombok.Data;

/**
 * @author yxl
 * @date 2018-12-18 20:07
 */
@Data
public class OrderDTO {

    private String orderId; //订单id

    private String buyerName; //买家名字

    private String buyerPhone; //买家电话

    private String buyerAddress; //买家地址

    private String buyerOpenid; //买家openid

    private BigDecimal orderAmount;//订单总金额

    private Integer orderStatus; //订单状态，默认新订单

    private Integer payStatus; //支付状态，默认未支付

    private Date createTime; //创建时间

    private Date updateTime; //更新时间

    private List<OrderDetail> orderDetailList;

}
