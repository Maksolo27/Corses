package com.company;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Animal("Murzhik", 43, true);
        Animal dog = new Animal("Murzhik", 43, true);
        System.out.println(cat.toString());
        System.out.println(cat.hashCode());
        System.out.println(dog.toString());
        System.out.println(dog.hashCode());
        System.out.println(dog.equals(cat));
    }
}
