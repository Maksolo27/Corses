package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int length = str.length() / 2;
        String s1 = "";
        for (int i = 0; i < length; i++) {
            s1 += str.charAt(i);
        }
        String s2 = "";
        for (int i = length; i <str.length() ; i++) {
            s2 += str.charAt(i);
        }
        System.out.println("Первая строка: " + s1);
        System.out.println("Её длина: " + s1.length() );
        System.out.println("Вторая строка: " + s2);
        System.out.println("Её длина: " + s2.length() );
    }
}
