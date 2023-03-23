package hello.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloControllelr {
	@GetMapping("/hello")
	public String hello(Model model, @RequestParam(required = false) String name) {
		
		model.addAttribute("data", name);
		return "hello";
	}
}
