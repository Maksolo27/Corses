package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();
        System.out.println("Введите заголовок: ");
        title.title = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Введите автора: ");
        author.author = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Введите содержание: ");
        content.content = sc.nextLine();
        Book book = new Book();
        book.title = title;
        book.content = content;
        book.author = author;
        book.show();
    }
}
