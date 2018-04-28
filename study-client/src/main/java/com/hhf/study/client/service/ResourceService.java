package com.hhf.study.client.service;

import com.hhf.study.client.dao.ResourceDao;
import com.hhf.study.client.entity.ResourceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 15:24 2018/4/28
 */
@Service
public class ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    public ResourceEntity getByUri(String uri){
        ResourceEntity resourceEntity=resourceDao.findByUri(uri);
        return resourceEntity;
    }
}
