package com.hhf.study.client.controller;

import com.hhf.study.client.controller.vo.ResultVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 10:39 2018/5/4
 */
@RestControllerAdvice
public class ExceptionController extends BaseController{

    //@ExceptionHandler(value=Exception.class)
    public Object exception(){
        return ResultVo.instance(EXCEPTION,"server exception",null);
    }
}
