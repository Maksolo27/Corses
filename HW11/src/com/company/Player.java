package com.company;

public class Player implements Playable, Recodable{

    @Override
    public void record() {
        System.out.println("Запись");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void play() {
        System.out.println("Проигрывает");
    }

    @Override
    public void stop() {
        System.out.println("Остановка");
    }
}
