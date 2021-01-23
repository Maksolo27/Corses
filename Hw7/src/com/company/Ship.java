package com.company;

public class Ship extends Vehicle {
    int amount;
    String port;
    public Ship(double x, double y, int price, int speed, int year, int amount, String port) {
        super(x, y, price, speed, year);
        this.amount = amount;
        this.port = port;
    }

    @Override
    public void view() {
        System.out.println("Координаты:");
        System.out.println(this.x + "  " + this.y);
        System.out.println("Порт приписки: " + this.amount);
        System.out.println("Цена: " + this.price);
        System.out.println("Скорость: " + this.speed);
        System.out.println("Год выпуска: " + this.year);
        System.out.println("Количество пассажиров: " + this.amount);
    }
    }

