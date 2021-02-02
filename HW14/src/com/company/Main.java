package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        Teacher samoylenko = new Teacher("Ivanova", "Galina");
        Teacher mironchenko = new Teacher("Melnyk", "Marina");
        Teacher kovalchuk = new Teacher("Honcharenko", "Larisa");

        teachers.add(kovalchuk);
        teachers.add(mironchenko);
        teachers.add(samoylenko);


        System.out.println("Индекс лучшего учителя:");
        System.out.println(teachers.indexOf(kovalchuk));
        System.out.println("Индекс худшего учителя");
        System.out.println(teachers.indexOf(mironchenko));


        for (int a = 0; a < teachers.size(); a++) {
            System.out.print(teachers.get(a).getFirstname() + " ");
            System.out.println(teachers.get(a).getLastname());
        }
    }
}
