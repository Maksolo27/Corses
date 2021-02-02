package com.company;

public class Calculator {
    public static double add(double a, double b){
        return  a + b;
    }
    public static double sub(double a, double b){
        return  a - b;
    }
    public static double mul(double a, double b){
        return  a * b;
    }
    public static double div(double a, double b){
        if(b == 0){
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a/b;
    }
}
