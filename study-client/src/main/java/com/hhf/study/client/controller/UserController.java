package com.hhf.study.client.controller;

import com.hhf.study.client.controller.vo.ResultVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 10:54 2018/4/11
 */
@RestController
@RequestMapping(path="/user")
public class UserController extends BaseController{

    /**
     * 用户注册
     * @return
     */
    @RequestMapping(path="/register")
    public Object register(@RequestParam String userName,@RequestParam String password){
        return new ResultVo<>(200,null,null);
    }
}
