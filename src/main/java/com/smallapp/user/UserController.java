package com.smallapp.user;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserDAO appUserRepository;

	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> login(@RequestParam String username, 
													 @RequestParam String password) throws IOException {
		
		System.out.println(username);
		AppUser appUser = appUserRepository.findByUsername(username);
		Map<String, Object> tokenMap = new HashMap<String, Object>();
		
		tokenMap = userService.checkAuth(appUser, password, username);
		
		return new ResponseEntity<Map<String, Object>>(tokenMap, HttpStatus.OK);
	}
}
