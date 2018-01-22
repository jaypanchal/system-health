package com.system.monitor.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	//We are initiating with Spring's security configuration to handle user's login and authentication related stuff
	
	@Autowired
	@Qualifier()
	UserDetailsService userDetailsService;
	
}
