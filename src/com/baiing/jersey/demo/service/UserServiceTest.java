package com.baiing.jersey.demo.service;

import java.util.List;

import org.junit.Test;

import com.baiing.jersey.demo.service.UserService;

public class UserServiceTest {

	@Test
	public void test() {
		
		UserService service = new UserService();
		List<Object> list = service.findAll();
		
		for(Object o : list){
			System.out.println(o);
		}
	}
}
