package com.hhf.study.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 10:08 2018/5/4
 */
public class JsonUtils {

    private static ObjectMapper objectMapper;

    public static ObjectMapper instance() {
        if(objectMapper==null){
            objectMapper= new ObjectMapper();
        }
        return objectMapper;
    }

    /**
     * 将对象转为json
     * @param o
     * @return
     */
    public static String toJson(Object o){
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json转对象
     * @param json
     * @param clazz
     * @return
     */
    public static Object fromJson(String json,Class clazz){
        try {
            return objectMapper.readValue(json,clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
