package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author yxl
 * @date 2018-12-18 14:23
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
