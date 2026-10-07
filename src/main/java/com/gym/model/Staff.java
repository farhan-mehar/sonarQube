package com.gym.model;

public class Staff {
    private final int id;
    private String name;
    private String role;
    private String phone;
    private double salary;

    public Staff(int id, String name, String role, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.phone = phone;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getPhone() { return phone; }
    public double getSalary() { return salary; }

    public void setRole(String role) { this.role = role; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setSalary(double salary) { this.salary = salary; }
}
