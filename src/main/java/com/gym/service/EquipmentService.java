package com.gym.service;

import com.gym.model.Equipment;
import com.gym.repository.EquipmentRepository;

import java.util.List;

public class EquipmentService {
    private final EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }

    public Equipment addEquipment(String name, int quantity, String condition) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Equipment name is required");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        return repository.add(name, quantity, condition);
    }

    public List<Equipment> getAllEquipment() {
        return repository.findAll();
    }
}
