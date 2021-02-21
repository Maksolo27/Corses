package com.company;

public class Main extends Thread{

    public static void main(String[] args) {
        Main main = new Main();
        First first = new First();
        Second second = new Second();
        main.start();
        first.start();
        second.start();
    }

    String word = "Main thread: ";
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(word + i);
        }
        System.out.println("End of main thread");
    }
}
