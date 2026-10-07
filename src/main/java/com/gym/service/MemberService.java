package com.gym.service;

import com.gym.model.Member;
import com.gym.repository.MemberRepository;

import java.util.List;
import java.util.Objects;

public class MemberService {
    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    public Member registerMember(String name, String phone, String email, String membershipType) {
        validate(name, phone, email, membershipType);
        return repository.save(
                new Member(repository.nextId(), name.trim(), phone.trim(), email.trim(), membershipType)
        );
    }

    public List<Member> getAllMembers() {
        return repository.findAll();
    }

    public Member findMember(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Member not found: " + id));
    }

    public void deactivateMember(int id) {
        findMember(id).deactivate();
    }

    public boolean removeMember(int id) {
        return repository.delete(id);
    }

    private void validate(String name, String phone, String email, String membershipType) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }
        if (phone == null || phone.isBlank()) {
            throw new IllegalArgumentException("Phone is required");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Valid email is required");
        }
        if (membershipType == null || membershipType.isBlank()) {
            throw new IllegalArgumentException("Membership type is required");
        }
    }
}
