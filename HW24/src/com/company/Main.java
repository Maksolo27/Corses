package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker[] workers = new Worker[2];
        for (int i = 0; i < workers.length; i++) {
            Worker worker = new Worker();
            System.out.println("Введите имя: ");
            worker.setName(scanner.nextLine());
            System.out.println("Введите год: ");
            try {
                worker.setYear(scanner.nextInt());
            }catch (Exception e){
                System.out.println("Неправильно введен год");
            }
            scanner = new Scanner(System.in);
            System.out.println("Введите должность: ");
            worker.setPosition(scanner.nextLine());
            System.out.println("------");
            workers[i] = (worker);
        }
        String[] names = new String[workers.length];
        for (int i = 0; i < workers.length; i++) {
            names[i] = workers[i].getName();
        }
        Arrays.sort(names);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите стаж работы: ");
        int standing = scanner1.nextInt();
        for (int i = 0; i < names.length; i++) {
            int experience = 2021 - workers[i].getYear();
            if(standing <= experience){
                for (Worker j : workers) {
                    j.soup(names[i]);
                }
            }
        }
    }
}
