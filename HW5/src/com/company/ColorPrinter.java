package com.company;

public class ColorPrinter extends Printer {
    public void print(String value){
        System.out.println((char) 27 + "[31m" + value + (char) 27 + "[39m");
    }

}
