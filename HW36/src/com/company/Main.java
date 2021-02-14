package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random()*99));
        }
        File f = new File("test.txt");
        try(final FileWriter writer = new FileWriter(f, true))
        {
            for (int i = 0; i < integers.size(); i++) {
                final String s = Integer.toString(integers.get(i));
                writer.append(s);
            }
            writer.flush();
        }catch (IOException e){
            System.err.println("Ошибка");
        }
    }
}
