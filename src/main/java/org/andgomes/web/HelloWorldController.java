
package org.andgomes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/hello"})
public class HelloWorldController {

	String message = "welcome daoisjda";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(@RequestParam(value = "name", 
			required = false, defaultValue = "World") String name){
		
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		
		return mv;
	}
	
	
	@RequestMapping("/oi")
	public String sayHello() {
		System.out.println("oi.");
		return "hello";
	}

	@RequestMapping("/tchau")
	public String sayGoodBye() {
		System.out.println("tchau.");
		return "bye";
	}

}