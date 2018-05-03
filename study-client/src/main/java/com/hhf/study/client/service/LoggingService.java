package com.hhf.study.client.service;

import com.hhf.study.client.dao.LoggingDao;
import com.hhf.study.client.entity.LoggingEntity;
import com.hhf.study.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 13:44 2018/5/2
 */
@Service
public class LoggingService {

    @Autowired
    private LoggingDao loggingDao;

    @Async
    public void add(LoggingEntity loggingEntity){
        loggingDao.save(loggingEntity);
    }

    public LoggingEntity getBySessionIdAndRequestURIAndCreateTimeMax(String sessionId,String requestURI){
        LoggingEntity loggingEntity=loggingDao.findBySessionIdAndRequestURIAndCreateTimeMax(sessionId,requestURI);
        return loggingEntity;
    }

    @Async
    public void update(LoggingEntity loggingEntity){
        loggingEntity.setUpdateTime(DateUtils.getTimeStr(new Date()));
        loggingDao.saveAndFlush(loggingEntity);
    }
}
