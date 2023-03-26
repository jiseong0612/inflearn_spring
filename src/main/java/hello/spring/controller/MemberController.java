package hello.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import hello.spring.domain.Member;
import hello.spring.domain.MemberForm;
import hello.spring.service.MemberService;

@Controller
public class MemberController {
	
	private final MemberService mService;
	
		@Autowired
		public MemberController(MemberService memberService	) {
			this.mService = memberService;
		}
		 
		@GetMapping("/members/new")
		public String createForm() {
			return "members/createMemberForm";
		}
		
		@PostMapping("/members/new")
		public String create(MemberForm form) {
			Member member = new Member();
			member.setName(form.getName());
			mService.join(member);
			
			return "redirect:/";
		}
		
		@GetMapping("/members")
		public String list(Model model) {
			model.addAttribute("members", mService.findMembers());
			return "members/memberList";
		}
		
}
  