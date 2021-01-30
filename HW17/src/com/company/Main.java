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
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.size());
        myArrayList.fill(5);
        System.out.println(myArrayList);
        int[]arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        myArrayList.concat(arr);
        System.out.println(myArrayList);

        myArrayList.clear();
    }
}
