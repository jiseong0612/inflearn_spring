package hello.core.member;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MemoriMemberRepositoryTest {
	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	@Test
	public void join() {
		Member member1 = new Member(1L, "user00", Grade.VIP);
		
		memberRepository.join(member1);
		Member result = memberRepository.findById(1L);
		
		assertThat(member1).isEqualTo(result);
	}
}
