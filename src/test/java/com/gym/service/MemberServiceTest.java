package com.gym.service;

import com.gym.model.Member;
import com.gym.repository.MemberRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    @Test
    void shouldRegisterMember() {
        MemberService service = new MemberService(new MemberRepository());

        Member member = service.registerMember(
                "Ali Khan",
                "03001234567",
                "ali@example.com",
                "Monthly"
        );

        assertEquals("Ali Khan", member.getName());
        assertEquals(1, service.getAllMembers().size());
        assertTrue(member.isActive());
    }

    @Test
    void shouldRejectInvalidEmail() {
        MemberService service = new MemberService(new MemberRepository());

        assertThrows(IllegalArgumentException.class, () ->
                service.registerMember(
                        "Ali Khan",
                        "03001234567",
                        "invalid-email",
                        "Monthly"
                )
        );
    }

    @Test
    void shouldDeactivateMember() {
        MemberService service = new MemberService(new MemberRepository());
        Member member = service.registerMember(
                "Sara Ahmed",
                "03111234567",
                "sara@example.com",
                "Yearly"
        );

        service.deactivateMember(member.getId());

        assertFalse(member.isActive());
    }
}
