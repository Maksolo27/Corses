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
        String matchedText = "";
        for (int i = 0; i < array.length; i++) {
            String regex = "\\w{4}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(array[i]);
            if(m.matches()){
                array[i] = "Java";     //Заменяю слова с длинной в 4 символа
            }
            matchedText += array[i] + " "; //Добавляю пробел к каждому слову
        }
        String replacedText = readText.replaceAll(readText,matchedText);  //Заменяю на новый текст
        reader.close();
        file.delete();               //Удаляю файл и создаю новый, чтобы заменить текст
        file = new File("C:\\Users\\maxim\\IdeaProjects\\HW42\\src\\text.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(file, true));
        writer.println(replacedText);
        writer.close();
    }
}
