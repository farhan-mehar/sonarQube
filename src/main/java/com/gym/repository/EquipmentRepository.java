package com.gym.repository;

import com.gym.model.Equipment;
import java.util.ArrayList;
import java.util.List;

public class EquipmentRepository {
    private final List<Equipment> equipment = new ArrayList<>();
    private int nextId = 1;

    public Equipment add(String name, int quantity, String condition) {
        Equipment item = new Equipment(nextId++, name, quantity, condition);
        equipment.add(item);
        return item;
    }

    public List<Equipment> findAll() {
        return new ArrayList<>(equipment);
    }
}
