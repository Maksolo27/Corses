package com.company;

public class Car {
    int year, weight;
    double speed;
    String color;
    Car(){

    }

    public Car(int year)
    {
        this.year = year;
    }
    public Car(int year, double speed){
        this.year = year;
        this.speed = speed;
    }
    public Car(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }
    public Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public int getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "year=" + year +
                ", weight=" + weight +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
