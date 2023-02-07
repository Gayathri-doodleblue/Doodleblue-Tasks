package com.example.security.serive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.security.entity.UserInfo;
import com.example.security.repository.UserInfoRepository;
@Service
public class UserService {
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	 public String addUser(UserInfo userinfo)
	   {
		 
		   userinfo.setPassword(passwordEncoder.encode(userinfo.getPassword()));
		  userInfoRepository.save(userinfo);
		  return "user added to System";
	   }

}
