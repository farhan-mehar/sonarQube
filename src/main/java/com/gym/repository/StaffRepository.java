package com.gym.repository;

import com.gym.model.Staff;
import java.util.ArrayList;
import java.util.List;

public class StaffRepository {
    private final List<Staff> staff = new ArrayList<>();
    private int nextId = 1;

    public Staff save(Staff employee) {
        staff.add(employee);
        return employee;
    }

    public Staff create(String name, String role, String phone, double salary) {
        return save(new Staff(nextId++, name, role, phone, salary));
    }

    public List<Staff> findAll() {
        return new ArrayList<>(staff);
    }
}
