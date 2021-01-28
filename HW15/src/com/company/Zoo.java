package com.company;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        int i = 0;
        zoo.add(i, "Tiger");
        zoo.add(i += 1, "Wolf");
        zoo.add(i += 1, "Babuin");
        zoo.add(i += 1, "Monkey");
        zoo.add(i+=1, "Pig");
        zoo.add(i+=1, "Giraffe");
        zoo.add(i+= 1, "Dog");
        zoo.add(i+= 1, "Cat");
        for (int j = 0; j < zoo.size(); j++) {
            System.out.println(zoo.get(j));
        }
        zoo.size();
        System.out.println("----------");
        zoo.remove(7);
        zoo.remove(5);
        zoo.remove(3);

        for (int j = 0; j < zoo.size(); j++) {
            System.out.println(zoo.get(j));
        }
        System.out.println(zoo.size());
    }
}
