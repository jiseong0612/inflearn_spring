package hello.core.discount;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicyTest {
	RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
	
	@Test
	@DisplayName("VIP는 10프로 할인이 적용됨")
	public void test() {
		Member member = new Member(1L, "memberVIP", Grade.VIP);
		
		int discount = discountPolicy.discount(member, 10000);
		
		assertThat(1000).isEqualTo(discount);
	}
}
