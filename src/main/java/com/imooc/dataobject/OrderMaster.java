package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;

import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

/**
 * @author yxl
 * @date 2018-12-18 14:02
 */
@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    @Id
    private String orderId; //订单id

    private String buyerName; //买家名字

    private String buyerPhone; //买家电话

    private String buyerAddress; //买家地址

    private String buyerOpenid; //买家openid

    private BigDecimal orderAmount;//订单总金额

    private Integer orderStatus = OrderStatusEnum.NEW.getCode(); //订单状态，默认新订单

    private Integer payStatus = PayStatusEnum.WAIT.getCode(); //支付状态，默认未支付

    private Date createTime; //创建时间

    private Date updateTime; //更新时间

}
