package com.example.demo.controller;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.util.UserService;

@WebMvcTest(UserController.class)
public class TestUserController3 {

	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private UserService service;
	
	String userName = "Lakshmi";

	@Test
	public void greetingShouldReturnMessageFromService() throws Exception {
		when(service.getUserInfo(userName)).thenReturn(userName+"test1");
		this.mockMvc.perform(get("/users/Lakshmi")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString(userName+"test1")));
	}
	
}