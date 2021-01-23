package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int expertKey, proKey;
        expertKey = 1111;
        proKey = 0000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ключ доступа: ");
        int password = scanner.nextInt();
        DocumentWorker document;
        if (password == expertKey){
            document = new ExpertDocumentWorker();
        }
        else if(password == proKey){
             document = new ProDocumentWorker();
        }
        else {
             document = new DocumentWorker();
        }
        document.openDocument();
        document.editDocument();
        document.saveDocument();

    }
}
