package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            File f = new File("text.txt");
            BufferedReader bw = new BufferedReader(new FileReader(f));
            String current;
            while((current = bw.readLine()) != null){
                System.out.println(current);
            }
            bw.close();
        }catch (IOException e){
            System.err.println("Ошибка");
        }

    }
}
