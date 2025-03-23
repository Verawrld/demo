package com.example.demo.service;

import com.example.demo.models.Member;
import com.example.demo.repository.MemberRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> searchMembersByName(String name) {
        return memberRepository.findByNameContaining(name);
    }
}