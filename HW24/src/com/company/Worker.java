package com.company;

public class Worker{
    private String name;
    private String position;
    private int year;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
