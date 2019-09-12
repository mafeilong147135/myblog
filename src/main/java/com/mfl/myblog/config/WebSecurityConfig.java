package com.mfl.myblog.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;


@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.formLogin()
            .loginPage("/login")
            //设置登录成功跳转页面，error=true控制页面错误信息的展示
            .successForwardUrl("/index")
            .failureUrl("/login?error=true")
            .permitAll() // 当需要用户登录的时候，要去的登录页面
            .and()
            .authorizeRequests().antMatchers("/test").permitAll()
            .anyRequest() // 定义哪些URL需要被保护，哪些不需要被保护 任何请求登录后都可以访问
            .authenticated()
            .and()
            .csrf().disable();
        //session管理,失效后跳转
        http.sessionManagement().invalidSessionUrl("/login");
        //单用户登录，如果有一个登录了，同一个用户在其他地方不能登录
        http.sessionManagement().maximumSessions(1).maxSessionsPreventsLogin(true);
        //退出时情况cookies
        http.logout().deleteCookies("JESSIONID");
        //解决中文乱码问题
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8"); filter.setForceEncoding(true);
        //
        http.addFilterBefore(filter,CsrfFilter.class);
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("用户名{}", username);
        // 自定义登录验证
        return null;
    }
}
