package com.member.repository;


import com.member.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest //통합 테스트 환경 만들기
@TestPropertySource(locations="classpath:application-test.properties")
public class MemberRepositoryTest {

    @Autowired // 객체 
    MemberRepository memberRepository;
    
    @Test
    @DisplayName("멤버저장 테스트")
    public void createMemberTest(){
        Member member = new Member();
        member.setId(1234);
        member.setAddress("대구시");
        member.setTel("01043333333");
        member.setName("옹이");
        member.setUpdateTime(LocalDateTime.now());
        member.setRegTime(LocalDateTime.now());

        Member savedMember = memberRepository.save(member);
        System.out.println(savedMember.toString());
    }
}
