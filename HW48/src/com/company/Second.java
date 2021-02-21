package com.company;

public class Second extends Thread{
    String word = "Second thread: ";
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(800);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(word + i);
        }
        System.out.println("End of second thread");
    }
}
