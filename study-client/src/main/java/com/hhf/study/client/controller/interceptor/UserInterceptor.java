package com.hhf.study.client.controller.interceptor;

import com.hhf.study.client.entity.PermissionEntity;
import com.hhf.study.client.entity.ResourceEntity;
import com.hhf.study.client.entity.RoleEntity;
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

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info(">>>",request.getRequestURI());
        ResourceEntity resourceEntity=resourceService.getByUri(request.getRequestURI());
        if(StringUtils.isEmpty(resourceEntity)){
            log.error("resource not found");
            return false;
        }
        if(resourceEntity.getIsEnable()== BasicConstants.YN.NO.getValue()){
            log.error("resource not enable");
            return false;
        }
        if(StringUtils.isEmpty(resourceEntity.getRoles())&&StringUtils.isEmpty(resourceEntity.getPermissions())){
            log.info("resource don't need roles and permissions");
            return true;
        }
        String jwt=request.getParameter(SecurityConstants.JWT);
        Jws<Claims> claims = Jwts.parser().setSigningKey(SecurityConstants.JWT_SECRET).parseClaimsJws(jwt);
        UserEntity userEntity=userService.get(Long.valueOf(claims.getHeader().get(SecurityConstants.USER_ID).toString()));
        if(userEntity==null){
            log.error("user not found");
            return false;
        }
        for(String role:resourceEntity.getRoles()){
            for(RoleEntity roleEntity:userEntity.getRoleList()){
                if(roleEntity.getName().equals(role)&&roleEntity.getIsEnable()== BasicConstants.YN.YES.getValue()){
                    for(String permission:resourceEntity.getPermissions()){
                        for(PermissionEntity permissionEntity:roleEntity.getPermissionList()){
                            if(permissionEntity.getName().equals(permission)){
                                log.info("user is valid");
                                return true;
                            }
                        }
                    }
                }
            }
        }
        log.info("user not valid");
        return false;
    }
}
