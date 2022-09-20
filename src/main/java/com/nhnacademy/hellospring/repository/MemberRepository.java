package com.nhnacademy.hellospring.repository;

import com.nhnacademy.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //optional 은 null값 처리
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
