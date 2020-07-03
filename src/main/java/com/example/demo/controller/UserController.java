package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.learning.model.UserInfo;
import com.example.demo.util.IUserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {	
	private final IUserService userService;
	 
    public UserController(IUserService courseService) {
        this.userService = courseService;
    }
	
	/**@GetMapping(path = "/{userName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserInfo getUsere(@PathVariable String userName) {
        return userService.getUserInfo(userName);
    }*/
	@GetMapping(path = "/{userName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUsere(@PathVariable String userName) {
        return userService.getUserInfo(userName);
    }
}
