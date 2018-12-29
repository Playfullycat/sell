package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author yxl
 * @date 2018-12-17 11:49
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
