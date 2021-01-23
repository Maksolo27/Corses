package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(1893);
        Car car3 = new Car(1934, 220);
        Car car4 = new Car(1976, 200, 1700);
        Car car5 = new Car(1990, 250, 1600, "Black");
        System.out.println(car4.toString());
    }
}
