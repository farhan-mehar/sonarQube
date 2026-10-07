package com.gym;

import com.gym.model.Member;
import com.gym.repository.MemberRepository;
import com.gym.service.MemberService;

public class Main {
    public static void main(String[] args) {
        MemberRepository repository = new MemberRepository();
        MemberService service = new MemberService(repository);

        Member member = service.registerMember(
                "Ali Khan", "03001234567", "ali@example.com", "Monthly");

        System.out.println("Gym Management System");
        System.out.println("Registered member: " + member.getName());
        System.out.println("Total members: " + service.getAllMembers().size());
    }
}
