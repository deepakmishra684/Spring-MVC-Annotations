package com.deepak.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author deepak
 *
 */
import org.springframework.web.servlet.ModelAndView;

import com.deepak.mvc.model.User;

@Controller
@RequestMapping("mvc1")
public class Test1Controller {
	public Test1Controller() {
		System.out.println("Test1Controller");
	}

	// http://localhost:8080/mvc1/register
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	// http://localhost:8080/mvc1/regSuccess
	@RequestMapping(value = "/regSuccess", method = RequestMethod.POST)
	public ModelAndView regSuccess(HttpServletRequest req, HttpServletResponse res) {
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");
		User user = new User(username, password, gender, city);
		ModelAndView model = new ModelAndView("regSuccess");
		model.addObject(user);
		return model;
	}
}
