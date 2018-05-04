package com.hhf.study.client.controller.interceptor;

import com.hhf.study.client.annotation.User;
import com.hhf.study.client.controller.BaseController;
import com.hhf.study.client.controller.vo.ResultVo;
import com.hhf.study.client.entity.ResourceEntity;
import com.hhf.study.client.entity.UserEntity;
import com.hhf.study.client.service.ResourceService;
import com.hhf.study.client.service.UserService;
import com.hhf.study.common.constant.BasicConstants;
import com.hhf.study.common.constant.SecurityConstants;
import com.hhf.study.common.utils.JsonUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger log = LoggerFactory.getLogger(UserInterceptor.class);

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        if (!method.isAnnotationPresent(User.class)) {
            log.debug("have no use for user");
            return true;
        }
        String jwt = request.getParameter(SecurityConstants.JWT);
        if (StringUtils.isEmpty(jwt)) {
            log.error("{} must be authentication", request.getRequestURI());
            response.getWriter().write(JsonUtils.toJson(ResultVo.instance(BaseController.ACCESS_RESTRICTED,null,null)));
            return false;
        }
        Jws<Claims> claims = Jwts.parser().setSigningKey(SecurityConstants.JWT_SECRET).parseClaimsJws(jwt);
        UserEntity userEntity = userService.get(Long.valueOf(claims.getHeader().get(SecurityConstants.USER_ID).toString()));
        if (userEntity == null || userEntity.getIsDeleted() == BasicConstants.YN.YES.getValue()) {
            log.error("user not found or is deleted");
            response.getWriter().write(JsonUtils.toJson(ResultVo.instance(BaseController.RECORD_NOT_FOUND,null,null)));
            return false;
        }
        if(userEntity.getIsEnabled().intValue()!= BasicConstants.YN.YES.getValue()){
            log.error("user {} not enabled",userEntity.getUserName());
            response.getWriter().write(JsonUtils.toJson(ResultVo.instance(BaseController.RECORD_NOT_ENABLED,null,null)));
            return false;
        }
        ResourceEntity resourceEntity=resourceService.getByUserIdAndUri(userEntity.getId().longValue(),request.getRequestURI());
        if(resourceEntity==null||resourceEntity.getIsEnable().intValue()== BasicConstants.YN.NO.getValue()){
            log.error("user {} lost resource {} or resource is not enabled",userEntity.getUserName(),request.getRequestURI());
            response.getWriter().write(JsonUtils.toJson(ResultVo.instance(BaseController.RECORD_NOT_ENABLED,null,null)));
            return false;
        }
        request.setAttribute(SecurityConstants.USER_ID,claims.getHeader().get(SecurityConstants.USER_ID));
        return true;
    }
}
