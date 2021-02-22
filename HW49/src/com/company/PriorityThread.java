package com.company;

public class PriorityThread extends Thread{
    String namePriority;

    public PriorityThread(String namePriority) {
        this.namePriority = namePriority;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(namePriority + " " + i);
        }
    }
}
