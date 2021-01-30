package com.company;

public class Main {

    public static void main(String[] args) {
	    Vehicles car = Vehicles.CAR;
	    Vehicles plane = Vehicles.PLANE;
	    Vehicles bike = Vehicles.BIKE;
	    Vehicles ship = Vehicles.SHIP;

        System.out.println(car.getPrice());
        System.out.println(car.getColor());
        System.out.println(car.toString());
        System.out.println("-----------");
        System.out.println(plane.getPrice());
        System.out.println(bike.getColor());
        System.out.println(ship.toString());
    }
}
