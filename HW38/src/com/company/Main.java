package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите первое предложение: ");
            String s1 = reader.readLine();
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите второе предложение: ");
            String s2 = reader.readLine();
            int counter1 = 1;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == ' ') {
                    counter1 += 1;
                }
            }
            int counter2 = 1;
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == ' ') {
                    counter2 += 1;
                }
            }
            System.out.println("В первом предложении: " + counter1 + " слов." );
            System.out.println("Во втором предложении:  " + counter2 + " слов." );
        }catch (IOException e){
            System.err.println("Ошибка");
        }
    }
}
