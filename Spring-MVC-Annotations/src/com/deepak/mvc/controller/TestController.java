package com.deepak.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deepak.mvc.model.User;

/**
 * @author deepak
 *
 */
@Controller
@RequestMapping("/mvc")
public class TestController {

	public TestController() {
		System.out.println("Controller");
	}

	/*
	 * @RequestMapping annotation map the request to the controller method which
	 * handle to that request
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView inexPage() {
		System.out.println("inexPage");
		return new ModelAndView("index", "message", "Spring4  MVC Hello World........");
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("user") User user, BindingResult result) {
		System.out.println("doLogin called");
		return null;
	}

	/*
	 * @PathVariable annotation is use to bind the url variable to method
	 * parameter variable,
	 * 
	 * @RequestParam annotation is use to bind String Query parameter if you
	 * want more String Query paramter so use add with '&'
	 */
	// http://localhost:8080/mvc/pathVariableAndRequestParam/Deepak/33?country=india
	@RequestMapping(value = "/pathVariableAndRequestParam/{name}/{age}", method = RequestMethod.GET)
	public ModelAndView pathVariableAndRequestParam(@PathVariable("name") String username,
			@PathVariable("age") int age,@RequestParam("country") String countryName) {
		System.out.println("pathVariableAndRequestParam called");
		return new ModelAndView("test", "WelcomeMessage",
				"Hi, " + username + " you are " + age + " years old and You are from " + countryName);
	}

	// http://localhost:8080/mvc/pathVariable/Deepak
	@RequestMapping(value = "/pathVariable/{name}", method = RequestMethod.GET)
	public ModelAndView pathVariable(@PathVariable("name") String username) {
		System.out.println("pathVariable called");
		return new ModelAndView("test", "WelcomeMessage", "Hi, " + username);
	}
    
	// http://localhost:8080/mvc/requestParam?salary=30000&uname=Deepak&password=12345
	@RequestMapping(value = "/requestParam", method = RequestMethod.GET)
	public ModelAndView requestParam(@RequestParam("salary") String salary, @RequestParam("uname") String username,
			@RequestParam("password") String password) {
		System.out.println("requestParam called");
		return new ModelAndView("test", "WelcomeMessage",
				"Hi, " + username + " your salary is " + salary + " and your password is" + password);
	}
	
	/*There are 3 ways to use Model*/
	// http://localhost:8080/mvc/model1
    @RequestMapping(value="/model1",method=RequestMethod.GET)
	public String welcomePage1(Model model)
	{
    	model.addAttribute("WelcomeMessage","Hi, welcome for model");
    	model.addAttribute("headerMessage", "Model Annotations");
    	return "test1";
	}
    
    // http://localhost:8080/mvc/model2
    @RequestMapping(value="/model2",method=RequestMethod.GET)
    public String welcomePage2(Map<String,Object> map)
    {
    	map.put("WelcomeMessage","Hi Model2, welcome for model");
    	map.put("headerMessage", "Model Annotations");
    	return "test1";
    }
    
    // http://localhost:8080/mvc/model3
    @RequestMapping(value="/model3",method=RequestMethod.GET)
   	public String welcomePage3(Model model)
   	{
       	return "test1";
   	}
    
    @ModelAttribute
    public void modelData(Model model)
    {
    	model.addAttribute("WelcomeMessage","Hi Model3, welcome for model");
       	model.addAttribute("headerMessage", "Model Annotations");
       	
    }
}
