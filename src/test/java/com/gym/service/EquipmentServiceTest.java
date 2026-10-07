package com.gym.service;

import com.gym.repository.EquipmentRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentServiceTest {

    @Test
    void shouldAddEquipment() {
        EquipmentService service = new EquipmentService(new EquipmentRepository());

        var equipment = service.addEquipment("Treadmill", 3, "Good");

        assertEquals("Treadmill", equipment.getName());
        assertEquals(3, equipment.getQuantity());
    }
}
