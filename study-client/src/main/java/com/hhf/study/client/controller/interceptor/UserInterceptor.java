package com.hhf.study.client.controller.interceptor;

import com.hhf.study.client.entity.ResourceEntity;
import com.hhf.study.client.entity.UserEntity;
import com.hhf.study.client.service.ResourceService;
import com.hhf.study.client.service.UserService;
import com.hhf.study.common.constant.BasicConstants;
import com.hhf.study.common.constant.SecurityConstants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 14:57 2018/3/26
 */

@Component
public class UserInterceptor extends HandlerInterceptorAdapter {

    private static final Logger log= LoggerFactory.getLogger(UserInterceptor.class);
    /**
     * 省略拦截的资源集
     */
    private static final String[] MISSED_RESOURCES={"/login","/register"};

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        for(String uri:UserInterceptor.MISSED_RESOURCES){
            if(request.getRequestURI().contains(uri)){
                log.debug("resource {} missed",request.getRequestURI());
                return true;
            }
        }
        String jwt=request.getParameter(SecurityConstants.JWT);
        if(StringUtils.isEmpty(jwt)){
            log.error("{} need be authentication",request.getRequestURI());
            return false;
        }
        Jws<Claims> claims = Jwts.parser().setSigningKey(SecurityConstants.JWT_SECRET).parseClaimsJws(jwt);
        UserEntity userEntity=userService.get(Long.valueOf(claims.getHeader().get(SecurityConstants.USER_ID).toString()));
        if(userEntity==null){
            log.error("user not found");
            return false;
        }
        ResourceEntity resourceEntity=resourceService.getByUserIdAndUri(userEntity.getId().longValue(),request.getRequestURI());
        if(resourceEntity==null||resourceEntity.getIsEnable().intValue()== BasicConstants.YN.NO.getValue()){
            log.error("user {} lost resource {} or resource is not enabled",userEntity.getUserName(),request.getRequestURI());
            return false;
        }
        return true;
    }
}
