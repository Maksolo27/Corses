package com.company;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return '{'+
                "Имя :'" + name + '\'' +
                ", Возраст:" + age +
                ", Хвост:" + (tail ? "есть" : "нет") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o.getClass() == this.getClass()){
            boolean resName = this.name.equals(((Animal) o).name);
            boolean resAge = this.age == ((Animal) o).age;
            boolean resTail = this.tail ==  ((Animal) o).tail;

            return  resName && resAge && resTail;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 35;
        result = 35 * result + (name != null ? name.hashCode() : 0);
        result = 35 * result + age;
        result = 35 * result + (tail ? 1 : 0);
        return result;
    }
}
