package com.example.security.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.security.entity.UserInfo;
import com.example.security.repository.UserInfoRepository;
@Component
public class UserInfoUserDetailsService implements UserDetailsService {
     @Autowired
     private UserInfoRepository userInfoRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserInfo> userinfo=userInfoRepository.findByName(username);
		return userinfo.map(UserInfoUserDetails::new)
		.orElseThrow(()->new UsernameNotFoundException("user not found"+username));
		
		
	}
    
}
 