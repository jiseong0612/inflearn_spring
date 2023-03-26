package hello.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.spring.domain.Member;
import hello.spring.repository.MemberRepository;

@Service
public class MemberService {
	private final MemberRepository memberRepository;
	
	@Autowired
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	public Long join(Member member) {
		memberRepository.findById(member.getId()).ifPresent(m -> {
			throw new IllegalStateException("이미 존재하는 아이디 입니다.");
		});
		memberRepository.save(member);

		return member.getId();
	}
	
	public List<Member>findMembers(){
		return memberRepository.findAll();
	}
}
