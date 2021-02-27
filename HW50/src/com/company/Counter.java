package com.company;

public class Counter extends Thread{
    Arifmetic arifmetic;
    Counter(Arifmetic arifmetic){
        this.arifmetic = arifmetic;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            synchronized (arifmetic) {
                arifmetic.increment();
                System.out.println(Thread.currentThread().getName() + " " + arifmetic.getCount());
            }
        }
    }
}
