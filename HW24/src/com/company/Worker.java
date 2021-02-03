package com.company;

public class Worker{
    private String name;
    private String position;
    private int year;

    public Worker(String name, String position, int year) {
        this.name = name;
        this.position = position;
        this.year = year;
    }
    public Worker(){

    }

    @Override
    public String toString() {
        return
                "Имя: '" + name + '\'' +
                ", Должность:'" + position + '\'' +
                ", Год вступления на должность: " + year;
    }
    public void soup(String name){
        if(name.equals(this.name)){
            System.out.println(new Worker(this.name,this.position,this.year));
        }
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
