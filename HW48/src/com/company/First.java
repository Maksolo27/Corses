package com.company;

public class First extends Thread{
    String word = "First thread: ";
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(400);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(word + i);
        }
        System.out.println("End of first thread");
    }
}
