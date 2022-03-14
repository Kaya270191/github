package com.member.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="member")
@Getter
@Setter
@ToString
public class Member {
    @Id
    @Column(name="member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; //아이디

    @Column(nullable = false, length=50)
    private String name; //이름

    @Column(nullable = false)
    private String address; //주소

    @Column(nullable = false)
    private String tel; //전화번호

    @Column(nullable = false)
    private LocalDateTime regTime; // 등록시간

    @Column(nullable = false)
    private LocalDateTime updateTime; //수정시간
}
