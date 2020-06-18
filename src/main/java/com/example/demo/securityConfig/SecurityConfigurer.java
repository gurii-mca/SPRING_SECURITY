package com.example.demo.securityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity

public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
@Autowired
UserDetailsService userDetailsService;
	@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
}
@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/Staff").hasAnyRole("STAFF","Doctor")
			.antMatchers("/Doctor").hasRole("Doctor")
			.and().formLogin().loginPage("/Login");
	}
@Bean
public PasswordEncoder getPasswordEncoder() {
	// TODO Auto-generated method stub
return NoOpPasswordEncoder.getInstance();
}
	
}
