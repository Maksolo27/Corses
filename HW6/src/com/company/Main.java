package com.company;

public class Main {

    public static void main(String[] args) {
        Pupil excelentpupil = new ExcelecntPupil();
        Pupil goodpupil = new Goodpupil();
        Pupil badpupil = new BadPupil();
        Pupil goodpupil2 = new Goodpupil();
        ClassRoom classRoom = new ClassRoom(excelentpupil, goodpupil2, goodpupil, badpupil);
        classRoom.pupil1.study();
        classRoom.pupil2.write();
        classRoom.pupil3.read();
        classRoom.pupil4.relax();
    }
}
