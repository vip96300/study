package com.hhf.study.gateway.filter;

import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 10:18 2018/3/26
 */
@Component
public class BaseFilter extends com.netflix.zuul.ZuulFilter{

    private static final Logger log= LoggerFactory.getLogger(BaseFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info("url:{}>>>method:{}",request.getMethod(), request.getRequestURL().toString());
        return null;
    }
}
