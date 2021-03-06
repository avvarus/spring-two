package com.example.springtwo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {


    //https://spring.io/guides/gs/securing-web/
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                  .antMatchers("/").permitAll()
                  .anyRequest().authenticated()
                  .and()
                  .formLogin()
                  //.loginPage("/login")
                  .permitAll();
        //.and()
        //.logout()
        //.permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser ("admin").password ("admin").roles ("USER");

    }


}

