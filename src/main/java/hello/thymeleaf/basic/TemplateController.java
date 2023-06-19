package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/template")
public class TemplateController {

	@GetMapping("/fragment")
	public String template() {
		return "/template/fragment/fragmentMain";
	}
}
