package com.gym.service;

import com.gym.model.Staff;
import com.gym.repository.StaffRepository;

import java.util.List;

public class StaffService {
    private final StaffRepository repository;

    public StaffService(StaffRepository repository) {
        this.repository = repository;
    }

    public Staff addStaff(String name, String role, String phone, double salary) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Staff name is required");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        return repository.create(name, role, phone, salary);
    }

    public List<Staff> getAllStaff() {
        return repository.findAll();
    }
}
