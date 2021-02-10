package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите следущую строку");
            String s = reader.readLine();
            stringArrayList.add(s);
        }
        Double.doubleValues(stringArrayList, stringArrayList.size());
        for (int i = 0; i <stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
    }
}
class Double{
    public static void doubleValues(ArrayList list, int size){
        int i = 0;
        while (i < size * 2) {
            list.add(i+1, list.get(i));
            i += 2;
        }
    }
}
