package com.gym.model;

import java.time.LocalDate;

public class Member {
    private final int id;
    private String name;
    private String phone;
    private String email;
    private String membershipType;
    private LocalDate joinDate;
    private boolean active;

    public Member(int id, String name, String phone, String email, String membershipType) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.membershipType = membershipType;
        this.joinDate = LocalDate.now();
        this.active = true;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getMembershipType() { return membershipType; }
    public LocalDate getJoinDate() { return joinDate; }
    public boolean isActive() { return active; }

    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
    public void setMembershipType(String membershipType) { this.membershipType = membershipType; }
    public void deactivate() { this.active = false; }
}
