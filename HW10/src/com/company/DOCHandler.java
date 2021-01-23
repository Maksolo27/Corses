package com.company;

public class DOCHandler extends AbstractHandler{

    @Override
    public void open() {
        System.out.println("Открытие в формате DOC");
    }

    @Override
    public void create() {
        System.out.println("Создание в формате DOC");
    }

    @Override
    public void change() {
        System.out.println("Изменение в формате DOC");
    }

    @Override
    public void save() {
        System.out.println("Сохранение в формате DOC");
    }
}
