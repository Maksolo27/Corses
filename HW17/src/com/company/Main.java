package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
            myArrayList.add(1);
            myArrayList.add(20);
            myArrayList.add(3, 10);
            myArrayList.add(5,24);
            myArrayList.add(20, 7);
            myArrayList.add(17,4);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.indexOff(4));
        myArrayList.set(3, 12);
        myArrayList.remove(5);
        myArrayList.remove(10);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.contains(7));
        System.out.println(myArrayList.contains(999));
        myArrayList.clear();
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.size());

    }
}
