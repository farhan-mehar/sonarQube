package com.gym.model;

import java.time.LocalDateTime;

public class Attendance {
    private final int id;
    private final int memberId;
    private final LocalDateTime checkIn;

    public Attendance(int id, int memberId) {
        this.id = id;
        this.memberId = memberId;
        this.checkIn = LocalDateTime.now();
    }

    public int getId() { return id; }
    public int getMemberId() { return memberId; }
    public LocalDateTime getCheckIn() { return checkIn; }
}
