package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\maxim\\IdeaProjects\\HW42\\src\\text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String readText = "";
        String temp;
        while ( (temp = reader.readLine()) != null) {
            readText += temp;   //Считываю файл
        }
        String[] array = readText.split(" ");   //Превращаю текст в массив
        String javaText = "";
        String[] prepositions = {"in", "inside", "at", "on", "behind", "between", "beside", "near", "against","under","across", "round", "by", "above", "over", "at", "on", "for", "after", "before", "into", "from", "up", "down", "across" };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < prepositions.length; j++) {
                if(array[i].equals(prepositions[j])){
                    array[i] = "Java";     //Заменяю предоги
                }
            }
            javaText += array[i] + " ";//Добавляю пробел к каждому слову
        }
        String replacedText = readText.replaceAll(readText,javaText);  //Заменяю на новый текст
        reader.close();
        file.delete();               //Удаляю файл и создаю новый, чтобы заменеть текст
        file = new File("C:\\Users\\maxim\\IdeaProjects\\HW42\\src\\text.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(file, true));
        writer.println(replacedText);
        writer.close();
    }
}
