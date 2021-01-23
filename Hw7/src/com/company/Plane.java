package com.company;

public class Plane extends Vehicle{
    double z;
    int amount;

    public Plane(double x, double y, int price, int speed, int year, double z, int amount) {
        super(x, y, price, speed, year);
        this.z = z;
        this.amount = amount;
    }

    @Override
    public void view() {
        System.out.println("Координаты:");
        System.out.println(this.x + "  " + this.y + "  " + this.z);
        System.out.println("Цена: " + this.price);
        System.out.println("Скорость: " + this.speed);
        System.out.println("Год выпуска: " + this.year);
        System.out.println("Количество пассажиров: " + this.amount);
    }
    }

