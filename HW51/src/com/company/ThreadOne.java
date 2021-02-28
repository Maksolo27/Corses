package com.company;

public class ThreadOne extends Thread{
    private Thread t;

    public void setT(Thread t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("Thread 1 start");
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1 finish");
    }
}
