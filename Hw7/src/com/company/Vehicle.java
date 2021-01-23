package com.company;

public class Vehicle {
    double x,y;
    int price, speed, year;

    public Vehicle(double x, double y, int price, int speed, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
    public void view(){
        System.out.println("Координаты:");
        System.out.println(this.x + "  " + this.y);
        System.out.println("Цена: " + this.price);
        System.out.println("Скорость: " + this.speed);
        System.out.println("Год выпуска: " + this.year);
    }
}
