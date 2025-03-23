package com.example.repository;

import com.example.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByNameContaining(String name);

    List<Member> findByPhoneNumber(String phoneNumber);
}