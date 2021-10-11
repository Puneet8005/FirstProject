package com.example.demo.security;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.codec.Encoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
     
		http.authorizeRequests()
		.antMatchers("/")
		.permitAll()
		.antMatchers("/css/*","/img/**","/js/*","/lib/**","/contactform/*")
	    .permitAll()
	    .anyRequest()
	    .authenticated()
	    .and()
	    .formLogin()
	    .loginPage("/login")
	    .defaultSuccessUrl("/started")
	    .permitAll();
		
	}
	
	
	  public void configure(AuthenticationManagerBuilder auth) throws Exception {
	  
	  auth.inMemoryAuthentication() .withUser("puneet") .password("{noop}puneet")
	  .roles("USER"); 
	  }
	 
	
	

}
