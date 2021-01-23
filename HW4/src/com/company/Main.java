package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Cars car1 = new Cars(1950);
        Cars car2 = new Cars(1980, 280);
        Cars car3 = new Cars(1990, 300, 2000);
        Cars car4 = new Cars(2000, 170, 2300, "Red");
        Cars car5 = new Cars();
        System.out.println(car4.year);
        System.out.println(car4.speed);
        System.out.println(car4.weight);
        System.out.println(car4.color);


    }
}
