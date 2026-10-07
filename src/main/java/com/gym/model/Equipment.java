package com.gym.model;

public class Equipment {
    private final int id;
    private String name;
    private int quantity;
    private String condition;

    public Equipment(int id, String name, int quantity, String condition) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.condition = condition;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public String getCondition() { return condition; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setCondition(String condition) { this.condition = condition; }
}
