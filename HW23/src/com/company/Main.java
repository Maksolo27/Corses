package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Calculator.div(5,0);
        } catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }finally {
            System.out.println(Calculator.add(2,2));
            System.out.println(Calculator.div(3,3));
            System.out.println(Calculator.sub(4,4));
        }



    }
}
