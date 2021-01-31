package com.company;

public class Distance {
    static double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    void print(){
        System.out.println(distance);
    }
    static class Converter {
        static double toKilometer(){
            return distance / 1000;
        }
        static double toMile(){
            return distance/ 1609;
        }
        static double toSantimeter(){
            return distance * 100;
        }
    }
}
