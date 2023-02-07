package com.example.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import ch.qos.logback.core.encoder.Encoder;
@Configuration
@EnableWebSecurity
public class MyApllicationSecurity  {
	@Bean
	public UserDetailsService userDetailsService()
	{
//	{
//		UserDetails admin=User.withUsername("xxx")
//				.password(encoder.encode("pwd"))
//				.roles("ADMIN")
//				.build();
//		UserDetails user=User.withUsername("yyy")
//				.password(encoder.encode("pwd1"))
//				.roles("USER")
//				.build();
//		return new InMemoryUserDetailsManager(admin,user);
	return new UserInfoUserDetailsService();
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
		return http.csrf().disable()
				.authorizeHttpRequests()
				.requestMatchers("/all","/new").permitAll()
				.and()
				.authorizeHttpRequests().requestMatchers("/admin")
				.authenticated().and()
				.authorizeHttpRequests().requestMatchers("/user")
				.authenticated().and().formLogin().and().build();
	}
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	 @Bean
	    public AuthenticationProvider authenticationProvider(){
	        DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
	        authenticationProvider.setUserDetailsService(userDetailsService());
	        authenticationProvider.setPasswordEncoder(passwordEncoder());
	        return authenticationProvider;
	    }
}
