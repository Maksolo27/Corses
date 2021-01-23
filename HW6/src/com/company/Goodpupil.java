package com.company;

public class Goodpupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Хорошист учится хорошо");;
    }

    @Override
    public void read() {
        System.out.println("Хорошист читает хорошо");
    }

    @Override
    public void write() {
        System.out.println("Хорошист пишет хорошо");
    }
    @Override
    public void relax() {
        System.out.println("Хорошист отдыхает хорошо");
    }
}
