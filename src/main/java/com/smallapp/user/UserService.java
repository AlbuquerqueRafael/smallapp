package com.smallapp.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public Map<String, Object> checkAuth(AppUser appUser, String password, String username){
		Map<String, Object> tokenMap = new HashMap<String, Object>();
		String token = null;
		
		if (appUser != null && appUser.getPassword().equals(password)) {		
			tokenMap.put("token", token);
			tokenMap.put("user", appUser);
		} else {
			throw new InvalidUserInfoException("Invalid username or login");
		}
		
		return tokenMap;
	}
}
