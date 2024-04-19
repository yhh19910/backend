package com.lwdevelop.backend.config;

import com.lwdevelop.backend.Dao.MemberRepository;
import com.lwdevelop.backend.Model.Member;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component 
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {

    Member member = new Member("test@gmail.com", "abc12345", "michael", "i am a developer");
    memberRepository.save(member);

    }
}