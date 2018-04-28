package com.hhf.study.client.dao;

import com.hhf.study.client.entity.ResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 15:23 2018/4/28
 */
public interface ResourceDao extends JpaRepository<ResourceEntity,Long>{

    ResourceEntity findByUri(String uri);
}
