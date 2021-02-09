package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        ListIterator<Integer> numb = numbers.listIterator();

        while (numb.hasNext()){
            System.out.println(numb.next());
        }
    }
}