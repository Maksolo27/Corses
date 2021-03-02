package com.company;

public class Main {

    public static void main(String[] args) {
        LyamdaOperation lyamdaAdd;
        lyamdaAdd = (a, b) -> a + b;
        LyamdaOperation lyamdaSub;
        lyamdaSub = (a,b) -> a - b;
        LyamdaOperation lyamdaMult;
        lyamdaMult = (a,b) -> a * b;
        LyamdaOperation lyamdaDiv;
        lyamdaDiv = (a, b) -> {
            if(b != 0){
                return a / b;
            }else {
                throw new ArithmeticException("Деление на 0");
            }
        };
        System.out.println(lyamdaAdd.operation(5,5));
        System.out.println(lyamdaSub.operation(10, 5));
        System.out.println(lyamdaMult.operation(20, 5));
        System.out.println(lyamdaDiv.operation(9, 3));
        System.out.println(lyamdaDiv.operation(3, 0));

    }
}
