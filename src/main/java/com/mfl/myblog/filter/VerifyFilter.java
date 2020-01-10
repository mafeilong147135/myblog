package com.mfl.myblog.filter;

import org.springframework.security.authentication.DisabledException;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class VerifyFilter extends OncePerRequestFilter {

    private static final PathMatcher pathMatcher = new AntPathMatcher();

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (this.isProtectedUrl(request)) {
            String verifyCode = request.getParameter("verifyCode");
            if (!validateVerify(verifyCode)) {
                //手动设置异常
                request.getSession().setAttribute("SPRING_SECURITY_LAST_EXCEPTION",new DisabledException("验证码输入错误!"));
                // 转发到错误Url
                request.getRequestDispatcher("/login/error").forward(request,response);
            } else {
                filterChain.doFilter(request,response);
            }
        } else {
            filterChain.doFilter(request,response);
        }
    }

    private boolean validateVerify(String verifyCode) {
        // 获取当前线程绑定的request对象
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        // 不区分大小写
        // 取出存在session里面的requestVerifyCode
        String validateCode = ((String) request.getSession().getAttribute("validateCode")).toLowerCase();
        verifyCode = verifyCode.toLowerCase();
        System.out.println("验证码：" + validateCode + "用户输入：" + verifyCode);
        return validateCode.equals(verifyCode);
    }

    private boolean isProtectedUrl(HttpServletRequest request) {
        return "POST".equalsIgnoreCase(request.getMethod()) && pathMatcher.match("/login", request.getServletPath());
    }
}
