package hello.core.order;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.singleton.SingletonService;

public class OrderServiceTest {
	AppConfig appConfig = new AppConfig();

//	MemberRepository memberRepository = appConfig.memberRepository();
//	OrderService orderService = appConfig.orderService();

	@Test
	void createOrder() {
//		Long memberId = 1L;
//		Member member = new Member(memberId, "memberA", Grade.VIP);
//		memberRepository.join(member);
//
//		Order order = orderService.createOrder(memberId, "itemA", 10000);
//		assertThat(order.getDiscountPrice()).isEqualTo(1000);
	}

	/**
	 * 싱글톤 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonService service1 = SingletonService.getInstance();
		SingletonService service12 = SingletonService.getInstance();

		System.out.println("main 1 = " + service1);
		System.out.println("main 2 = " + service12);

	}
}
