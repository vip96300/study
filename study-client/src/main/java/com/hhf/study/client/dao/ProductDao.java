package com.hhf.study.client.dao;

import com.hhf.study.client.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 16:33 2018/4/4
 */
public interface ProductDao extends JpaRepository<ProductEntity,Long> {
}
