package com.company;

public enum Vehicles {
    CAR(25000, "RED"), PLANE(4000000, "BLACK"), SHIP(70000000, "YELLOW"), BIKE(1000, "GREEN");

    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "name=" + name() +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
