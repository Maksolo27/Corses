package com.company;

public enum Animals {
    TIGER(16), RAM(12), SQUIRREL(4), STORK(2);
    private int age;
    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name =" + name() +
                ", age =" + age;
    }
}
