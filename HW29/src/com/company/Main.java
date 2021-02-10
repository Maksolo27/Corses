package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> stringArrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите значение [" + i + "]");
            String s = reader.readLine();
            if(s.equals("end")){
                break;
            }
            stringArrayList.add(s);
        }
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
    }
}
