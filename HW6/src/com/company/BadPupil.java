package com.company;

public class BadPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("Двоечник учится плохо");;
    }

    @Override
    public void read() {
        System.out.println("Двоечник читает плохо");
    }

    @Override
    public void write() {
        System.out.println("Двоечник пишет плохо");
    }
    @Override
    public void relax() {
        System.out.println("Двоечник отдыхает плохо");
    }
}
