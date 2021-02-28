package com.company;

public class ThreadTwo extends Thread{
    private Thread t;

    public void setT(Thread t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("Thread 2 start");
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 2 finish");
    }
}
