package com.gym.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttendanceServiceTest {

    @Test
    void shouldCheckInMember() {
        AttendanceService service = new AttendanceService();

        var attendance = service.checkIn(1);

        assertEquals(1, attendance.getMemberId());
        assertEquals(1, service.getRecords().size());
    }

    @Test
    void shouldRejectInvalidMemberId() {
        AttendanceService service = new AttendanceService();

        assertThrows(IllegalArgumentException.class, () -> service.checkIn(0));
    }
}
