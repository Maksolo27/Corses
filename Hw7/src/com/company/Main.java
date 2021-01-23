package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car(13.23,45.14,23000,220,1964);
        car.view();
        System.out.println("----------");
        Vehicle plane = new Plane(22,54.9,4000000, 780,1998,34.8, 200);
        plane.view();
        System.out.println("----------");
        Vehicle ship = new Ship(43.6,22.8,35000000,67,1975,400, "Констанца");
        ship.view();
    }
}
