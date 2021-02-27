package com.company;

public class Main {

    public static void main(String[] args) {
        Arifmetic arifmetic = new Arifmetic();
        Counter c1 = new Counter(arifmetic);
        Counter с2 = new Counter(arifmetic);
        Counter c3 = new Counter(arifmetic);
        c1.start();
        с2.start();
        c3.start();
    }
}
