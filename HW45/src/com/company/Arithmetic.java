package com.company;

public class Arithmetic {

    @Math(a = 10, b = 20)
    public void sum(int a, int b){
        System.out.println(a + b);
    }
}
