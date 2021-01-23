package com.company;

public class TXTHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Открытие в формате TXT");
    }

    @Override
    public void create() {
        System.out.println("Создание в формате TXT");
    }

    @Override
    public void change() {
        System.out.println("Изменение в формате TXT");
    }

    @Override
    public void save() {
        System.out.println("Сохранение в формате TXT");
    }
}
