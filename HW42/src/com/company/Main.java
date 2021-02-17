package com.company;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\maxim\\IdeaProjects\\HW42\\src\\text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = "";
        String temp;
        while ( (temp = br.readLine()) != null) {
            text += temp;
        }
        String[] array = text.split(" ");
        String result = "";
        for (int i = 0; i < array.length; i++) {
            String regex = "\\w{4}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(array[i]);
            if(m.matches()){
                array[i] = "Java ";
            }
            result += array[i] + " ";
        }
        String res = text.replaceAll(text,result);
        br.close();
        file.delete();
        file = new File("C:\\Users\\maxim\\IdeaProjects\\HW42\\src\\text.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println(res);
        pw.close();
    }
}
