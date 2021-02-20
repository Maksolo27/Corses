package com.company;

public class Main {

    public static void main(String[] args) {
        ExtendThread1 thread1 = new ExtendThread1();
        ExtendThread2 thread2 = new ExtendThread2();
        thread1.start();
        thread2.start();
    }
}
