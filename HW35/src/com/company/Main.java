package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File f = new File("test.txt");
        try(FileWriter fileWriter = new FileWriter(f, true)){
            String s = "Hello";
            fileWriter.write(s);
            fileWriter.flush();
        }catch (IOException e){
            System.err.println("Ошибка");
        }
        try(FileReader fileReader = new FileReader("test.txt")){
            int c;
            while((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }

        }catch (IOException e){
            System.err.println("Ошибка");
        }

    }
}
