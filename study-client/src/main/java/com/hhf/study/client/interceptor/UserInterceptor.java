package com.hhf.study.client.interceptor;

import com.hhf.study.client.annotation.User;
import com.hhf.study.client.entity.RoleEntity;
import com.hhf.study.client.entity.UserEntity;
import com.hhf.study.client.service.UserService;
import com.hhf.study.common.constant.SecurityConstants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 14:57 2018/3/26
 */

@Component
public class UserInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        if(method.isAnnotationPresent(User.class)){
            String jwt=request.getParameter(SecurityConstants.JWT);
            Jws<Claims> claims = Jwts.parser().setSigningKey(SecurityConstants.JWT_SECRET).parseClaimsJws(jwt);
            UserEntity userEntity=userService.get(Long.valueOf(claims.getHeader().get(SecurityConstants.USER_ID).toString()));
            if(StringUtils.isEmpty(userEntity)){
                response.setStatus(401);
                response.getWriter().write("user not found");
                return false;
            }
            //TODO 角色权限校验
        }
        response.setStatus(401);
        response.getWriter().write("missed user permission:"+method.getAnnotation(User.class).permissions());
        return false;
    }
}
