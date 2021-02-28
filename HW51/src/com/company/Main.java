package com.company;

public class Main {

    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();

        threadOne.setT(threadOne);
        threadTwo.setT(threadTwo);
        

        threadOne.start();
        threadTwo.start();

    }
}
