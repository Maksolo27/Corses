package com.company;


public class Cars {
    int year, weight;
    double speed;
    String color;
    public Cars(){

    }

    public Cars(int year) {
        this.year = year;
    }
    public Cars(int year, double speed) {
        this(year);
        this.speed = speed;
    }
    public Cars(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }
    public Cars(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }


}
