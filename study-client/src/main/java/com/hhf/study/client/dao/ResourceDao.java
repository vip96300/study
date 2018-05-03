package com.hhf.study.client.dao;

import com.hhf.study.client.entity.ResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 15:23 2018/4/28
 */
public interface ResourceDao extends JpaRepository<ResourceEntity,Long>{

    @Query(value = "select * from study_resource o where o.id =(select resource_id from study_user_resource r where r.user_id=?1) and o.uri=?2",nativeQuery = true)
    ResourceEntity findByUserIdAndUri(long userId,String uri);
}
