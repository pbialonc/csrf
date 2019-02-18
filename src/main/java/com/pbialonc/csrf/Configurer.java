package com.pbialonc.csrf;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class Configurer extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.exceptionHandling()
                .accessDeniedHandler((a,b,c) -> b.setStatus(HttpStatus.BAD_REQUEST.value()))
                .defaultAccessDeniedHandlerFor((a,b,c) -> b.setStatus(HttpStatus.I_AM_A_TEAPOT.value()), new AntPathRequestMatcher("/teapot"));
    }

}
