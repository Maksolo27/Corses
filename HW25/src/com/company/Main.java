package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Price[] prices = new Price[2];
        for (int i = 0; i < prices.length ; i++) {
            prices[i] = new Price();
            System.out.println("Введите название товара: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            prices[i].setName(name);
            System.out.println("Введите название магазина: ");
            scanner = new Scanner(System.in);
            prices[i].setShop(scanner.nextLine());
            System.out.println("Введите стоимость товара в гривнах");
            scanner = new Scanner(System.in);
            prices[i].setPrice(scanner.nextInt());
        }
        String[] shops = new String[2];
        for (int i = 0; i < prices.length; i++) {
            shops[i] = prices[i].getShop();
        }
        Arrays.sort(shops);
        for (int i = 0; i < shops.length; i++) {
            for (Price j:prices) {
                j.soub(shops[i]);
            }
        }
        System.out.println("Введите название магазина");
        Scanner scanner = new Scanner(System.in);
        String changedShop = scanner.nextLine();
        for (int i = 0; i < prices.length; i++) {
            if(prices[i].getShop().equals(changedShop)){
                System.out.println(prices[i].toString());
            }
        }


    }
}
