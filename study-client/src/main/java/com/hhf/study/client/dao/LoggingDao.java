package com.hhf.study.client.dao;

import com.hhf.study.client.entity.LoggingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 11:55 2018/5/2
 */
public interface LoggingDao extends JpaRepository<LoggingEntity,Long>{

    /**
     * 根据sessionId和请求资源路径查询创建时间最大的一条记录
     * @param sessionId
     * @param requestURI
     * @return
     */
    @Query(value="select * from study_logging o where o.session_id=?1 and o.requesturi=?2 and o.create_time=(select max(create_time) from study_logging)",nativeQuery = true)
    LoggingEntity findBySessionIdAndRequestURIAndCreateTimeMax(String sessionId,String requestURI);
}
