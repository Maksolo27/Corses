package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadOne extends Thread{
    private Thread t;
    private Lock lock = new ReentrantLock();

    public void setT(Thread t) {
        this.t = t;
        System.out.println("Set Thread 1");
    }

    public Lock getLock() {
        return lock;
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