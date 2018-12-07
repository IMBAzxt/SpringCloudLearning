package com.zhengxuetao.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class AccessFilter extends ZuulFilter {
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
    public Object run() throws ZuulException {
        RequestContext ctx  = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = String.valueOf(request.getParameter("token"));
        if(token == null || token.equals("")|| "null".equals(token)) {
            System.out.println("token null");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
        } else {
            System.out.println(token);
        }
        return null;
    }
}
