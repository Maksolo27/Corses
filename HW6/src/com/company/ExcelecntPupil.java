package com.company;

public class ExcelecntPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Отличник учится отлично");;
    }

    @Override
    public void read() {
        System.out.println("Отличник читает отлично");
    }

    @Override
    public void write() {
        System.out.println("Отличник пишет отлично");
    }
    @Override
    public void relax() {
        System.out.println("Отличник отдыхает отлично");
    }
}
