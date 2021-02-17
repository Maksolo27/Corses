package com.company;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\maxim\\IdeaProjects\\HW42\\src\\text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = "";
        String temp;
        while ( (temp = br.readLine()) != null) {
            text += temp;   //Считываю файл
        }
        String[] array = text.split(" ");   //Разбиваю текст по словам в массив
        String result = "";
        for (int i = 0; i < array.length; i++) {
            String regex = "\\w{4}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(array[i]);
            if(m.matches()){
                array[i] = "Java ";     //Заменяю слова с длинной в 4 символа
            }
            result += array[i] + " "; //Добавляю пробел к каждому слову
        }
        String res = text.replaceAll(text,result);  //Заменяю на новый текст
        br.close();
        file.delete();               //Удаляю файл и создаю новый, чтобы заполнить замененным текстом
        file = new File("C:\\Users\\maxim\\IdeaProjects\\HW42\\src\\text.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println(res);
        pw.close();
    }
}
