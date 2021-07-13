package hello.springcore.discount;

import hello.springcore.annotation.MainDiscountPolicy;
import hello.springcore.member.Grade;
import hello.springcore.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 고정 할인
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }else{
            return 0;
        }
    }
}
