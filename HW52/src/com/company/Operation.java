package com.company;

import java.util.concurrent.TimeUnit;

public class Operation {

    public void operation(ThreadOne threadOne, ThreadTwo threadTwo){
        System.out.println("Start operation 1");

        try {
            if(threadOne.getLock().tryLock(5, TimeUnit.SECONDS)){
                if(threadTwo.getLock().tryLock(5, TimeUnit.SECONDS)){
                    threadOne.setT(threadTwo);
                }
                else {
                    System.out.println("Thread 2 is buisy");
                }
            }
            else {
                System.out.println("Thread 1 is buisy");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            threadTwo.getLock().unlock();
        }
    }
/*    public void operation( ThreadTwo threadTwo, ThreadOne threadOne){
        System.out.println("Start operation 2 ");

        try {
            if(threadTwo.getLock().tryLock(2, TimeUnit.SECONDS)){
                if(threadOne.getLock().tryLock(2, TimeUnit.SECONDS)){
                    threadTwo.setT(threadOne);
                }
                else {
                    System.out.println("Thread 1 is buisy");
                }
            }
            else {
                System.out.println("Thread 2 is buisy");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            threadOne.getLock().unlock();
        }
    }*/
}
