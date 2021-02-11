package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();

        map.put("Москва", "Ивановы");
        map.put("Киев", "Петровы");
        map.put("Лондон", "Абрамовичи");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите ключ");
        String current = reader.readLine();

        System.out.println(map.get(current));
    }
}
