package com.nhnacademy.hellospring.config;

import com.nhnacademy.hellospring.aop.TimeTraceAop;
import com.nhnacademy.hellospring.repository.JdbcMemberRepository;
import com.nhnacademy.hellospring.repository.JdbcTemplateMemberRepository;
import com.nhnacademy.hellospring.repository.JpaMemberRepository;
import com.nhnacademy.hellospring.repository.MemberRepository;
import com.nhnacademy.hellospring.repository.MemoryMemberRepository;
import com.nhnacademy.hellospring.service.MemberService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.hellospring"})
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //    @PersistenceContext
//    private EntityManager em;
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    //    private final DataSource dataSource;
//
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository() {
//// return new MemoryMemberRepository();
//        //return new JdbcMemberRepository(dataSource);
//        //return new JdbcTemplateMemberRepository(dataSource);
////        return new JpaMemberRepository(em);
//    }

//    @Bean
//    public TimeTraceAop timeTraceAop() {
//        return new TimeTraceAop();
//    }
}

