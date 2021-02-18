package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите дату: ");
        String date = null; //Строка не только с числами и спец.символами
        try {
            date = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] array = date.split(""); //Массив с числами и спец.символами
        String number = ""; //Строка только с числами
        for (int i = 0; i < array.length; i++) {
            Pattern p = Pattern.compile("\\D");
            Matcher m = p.matcher(array[i]);
            if(m.matches()){
                array[i] = "";      // Заменяю все числа на пустоту
            }
            number += array[i];
        }
        String[] numbers = number.split("");   // Создаю массив только чисел
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.valueOf(numbers[i]); //Беру значение строки
        }
        System.out.println(sum);


    }
}
