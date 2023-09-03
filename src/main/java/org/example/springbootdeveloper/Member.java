package org.example.springbootdeveloper;


import jakarta.persistence.*;
import lombok.*;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자
@AllArgsConstructor
@Getter
@Entity //엔티티로 지정
public class Member {
    @Id //id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "name", nullable = false) //name 은 not null 처리
    private String name;
}

