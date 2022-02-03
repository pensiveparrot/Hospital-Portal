package com.hospitalportal.postapptsummary;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityOverrideConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(WebSecurity web) throws Exception 
	{
	    // Allow Login API to be accessed without authentication

		web.ignoring().antMatchers("/login").antMatchers(HttpMethod.OPTIONS, "/**"); // Request type options should be allowed.
    }
}


