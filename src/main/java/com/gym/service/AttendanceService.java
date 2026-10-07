package com.gym.service;

import com.gym.model.Attendance;
import java.util.ArrayList;
import java.util.List;

public class AttendanceService {
    private final List<Attendance> records = new ArrayList<>();
    private int nextId = 1;

    public Attendance checkIn(int memberId) {
        if (memberId <= 0) {
            throw new IllegalArgumentException("Member ID must be positive");
        }
        Attendance attendance = new Attendance(nextId++, memberId);
        records.add(attendance);
        return attendance;
    }

    public List<Attendance> getRecords() {
        return new ArrayList<>(records);
    }
}
