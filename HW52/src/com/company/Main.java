package com.company;

public class Main {

    public static void main(String[] args) {
        Operation operation = new Operation();


        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();

        operation.operation(threadOne, threadTwo);




        threadOne.start();
        threadTwo.start();

    }
}