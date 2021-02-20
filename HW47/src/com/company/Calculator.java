package com.company;

public class Calculator {
    @Documented(doc = "Operation addition", a = 5, b = 10)
    public void add(int a, int b){
        System.out.println(a + b);
    }
    @Documented(doc = "Operation subtraction", a = 30, b = 20)
    public void sub(int a, int b){
        System.out.println(a - b);
    }
    @Documented(doc = "Operation division", a = 15, b = 3)
    public void div(int a, int b){
        System.out.println(a / b);
    }
    @Documented(doc = "Operation multiplication", a = 3, b = 3)
    public void mult(int a, int b){
        System.out.println(a * b);
    }
}
