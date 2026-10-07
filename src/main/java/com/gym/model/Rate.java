package com.gym.model;

public class Rate {
    private final String membershipType;
    private final double amount;

    public Rate(String membershipType, double amount) {
        this.membershipType = membershipType;
        this.amount = amount;
    }

    public String getMembershipType() { return membershipType; }
    public double getAmount() { return amount; }
}
