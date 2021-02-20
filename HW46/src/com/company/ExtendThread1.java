package com.company;

public class ExtendThread1 extends Thread{

    String name = "ExtendThread1";
    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(500);
                System.out.println(name + " " + i);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
