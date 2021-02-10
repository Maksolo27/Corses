package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        LinkedList<Integer> integers = new LinkedList<>();
        Getters.getIntegerList(integers);

            System.out.println(integers);

        System.out.println("Самое маленько число: ");
        System.out.println(Getters.getMinimum(integers));
    }
}
class Getters{
    public static LinkedList getIntegerList(LinkedList list) throws IOException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите число");
            Scanner reader = new Scanner(System.in);
            int N = reader.nextInt();
            list.add(N);
        }
        return list;
    }
    public static int getMinimum(LinkedList<Integer> list){
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
}
