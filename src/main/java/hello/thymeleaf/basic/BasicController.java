package hello.thymeleaf.basic;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {

	@GetMapping("/text-basic")
	public String textBasic(Model model) {
		
		model.addAttribute("data", "<b>Hello</b> Spring~!");
		
		Map<String, String> userMap = new HashMap<>();
		userMap.put("userA", "aaa");
		userMap.put("userB", "bbb");
		
		model.addAttribute("userMap", userMap);
		
		return "basic/text-basic";
	}
	
	@GetMapping("/basic-objects")
	public String basicObjects(HttpSession session, HttpServletRequest req) {
		HttpSession session2 = req.getSession();
		session.setAttribute("sessionData", "session1");
		session2.setAttribute("session2", "session2"); 
		
		System.out.println(session == session2);
		
		return "basic/basic-objects"; 	
	}
	
	@Component("helloBean")
	static class HelloBean {
		public String hello (String data) {
			return "hello " + data;
		}
	}
}
