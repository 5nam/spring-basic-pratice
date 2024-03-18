package hello.core.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        // given : 이런 환경이 주어지고,
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when : 이럴 때,
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then : 이런 결과가 나온다.
        assertEquals(member, findMember);
    }
}