package com.gym.repository;

import com.gym.model.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemberRepository {
    private final List<Member> members = new ArrayList<>();
    private int nextId = 1;

    public Member save(Member member) {
        members.add(member);
        return member;
    }

    public int nextId() {
        return nextId++;
    }

    public List<Member> findAll() {
        return new ArrayList<>(members);
    }

    public Optional<Member> findById(int id) {
        return members.stream()
                .filter(member -> member.getId() == id)
                .findFirst();
    }

    public boolean delete(int id) {
        return members.removeIf(member -> member.getId() == id);
    }
}
