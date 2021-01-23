package com.company;

public class XMLHandler extends AbstractHandler{

    @Override
    public void open() {
        System.out.println("Открытие в формате XML");
    }

    @Override
    public void create() {
        System.out.println("Создание в формате XML");
    }

    @Override
    public void change() {
        System.out.println("Изменение в формате XML");
    }

    @Override
    public void save() {
        System.out.println("Сохранение в формате XML");
    }
}
