package com.baiing.jersey.demo.ws;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.baiing.jersey.demo.domain.User;
import com.baiing.jersey.demo.service.UserService;

@Path("/users")
public class RestSample {
	private static Logger logger = Logger.getLogger(UserService.class);
	@Context
	ServletContext context;

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("id") Long id) {
		WebApplicationContext wac = WebApplicationContextUtils
				.getRequiredWebApplicationContext(context);
		UserService userService = (UserService) wac.getBean("userService");
		User u = (User) userService.findUserById(id);
		logger.info(u.getUsername());
		return u;
	}
}
