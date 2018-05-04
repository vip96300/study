package com.hhf.study.client.controller;

import com.hhf.study.client.controller.vo.ResultVo;
import com.hhf.study.common.constant.SecurityConstants;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping(path="/register")
    public Object register(@RequestParam(name="userName") String userName,
                           @RequestParam(name="password") String password){
        return ResultVo.instance(SUCCESS,null,null);
    }

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    @GetMapping(path="/getUser")
    public Object get(@RequestAttribute(name= SecurityConstants.USER_ID) long userId){
        return null;
    }
}
