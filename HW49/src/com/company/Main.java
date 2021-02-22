package com.company;

public class Main {

    public static void main(String[] args) {
        PriorityThread min = new PriorityThread("Priority(1)");
        min.setPriority(1);
        PriorityThread norm = new PriorityThread("Priority(5)");
        norm.setPriority(5);
        PriorityThread max = new PriorityThread("Priority(10)");
        max.setPriority(10);
        min.start();
        norm.start();
        max.start();

    }
}
