package com.mfl.myblog.config;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.formLogin() // 当需要用户登录的时候，要去的登录页面
            .and()
            .authorizeRequests() // 定义哪些URL需要被保护，哪些不需要被保护
            .anyRequest() // 任何请求登录后都可以访问
            .authenticated();
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("用户名{}", username);
        return null;
    }
}
