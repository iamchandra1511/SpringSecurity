package com.security.SecurityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class ProjectSecurity extends WebSecurityConfigurerAdapter
{
	protected void configure(HttpSecurity security)throws Exception
	{
	           security.authorizeRequests()
	           .antMatchers("/GetAllCustomers").authenticated()
	           .antMatchers("/Get").permitAll()
	           .antMatchers("/GetCustomerObject").permitAll()
	           .and()
	           .formLogin()
	           .and()
	           .httpBasic();
	}

}
