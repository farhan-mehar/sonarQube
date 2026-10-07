package com.gym.service;

import com.gym.repository.StaffRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffServiceTest {

    @Test
    void shouldAddStaff() {
        StaffService service = new StaffService(new StaffRepository());

        var staff = service.addStaff(
                "Usman",
                "Trainer",
                "03001112222",
                50000
        );

        assertEquals("Trainer", staff.getRole());
        assertEquals(1, service.getAllStaff().size());
    }

    @Test
    void shouldRejectNegativeSalary() {
        StaffService service = new StaffService(new StaffRepository());

        assertThrows(IllegalArgumentException.class, () ->
                service.addStaff("Usman", "Trainer", "03001112222", -100)
        );
    }
}
