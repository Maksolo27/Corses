package com.company;

public class Main {

    public static void main(String[] args) {
        Distance d = new Distance(10000);
        d.print();
        System.out.println(Distance.Converter.toMile());
        System.out.println(Distance.Converter.toKilometer());
        System.out.println(Distance.Converter.toSantimeter());
    }
}
