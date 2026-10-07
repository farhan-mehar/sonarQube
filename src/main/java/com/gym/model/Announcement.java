package com.gym.model;

import java.time.LocalDateTime;

public class Announcement {
    private final int id;
    private final String title;
    private final String message;
    private final LocalDateTime createdAt;

    public Announcement(int id, String title, String message) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getMessage() { return message; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
