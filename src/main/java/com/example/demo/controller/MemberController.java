package com.example.demo.controller;

import com.example.demo.models.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    @GetMapping("/search")
    public List<Member> searchMembersByName(@RequestParam String name) {
        return memberService.searchMembersByName(name);
    }
}