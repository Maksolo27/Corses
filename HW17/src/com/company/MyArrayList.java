package com.company;

import java.util.Arrays;

public class MyArrayList {
    private int[] list = new int[10];
    private int size;


    public int[] add(int element){
        if (size == list.length) {
            int[] newlist = new int[size * 3 / 2 + 1];
            System.arraycopy(list, 0, newlist, 0, list.length);
            list = newlist;
        }
            list[size] = element;
            size++;

        return  list;
    }
    public int get(int index){
        return list[index];
    }
    public int[] add(int index, int element){
        if (size == list.length || index > list.length) {
            int[] newlist = new int[size + index + 1];
            System.arraycopy(list, 0, newlist, 0, list.length);
            list = newlist;
        }
        list[index] = element;
        size = list.length;

        return list;
    }
    public int[] remove(int index){
        if(index > list.length){
            throw new Error("Index is bigger than list size");
        }
        else {
            int[] newlist = new int[list.length - 1];
            System.arraycopy(list, 0 , newlist,0, index);
            System.arraycopy(list, index + 1, newlist, index, list.length - index-1);
            list = newlist;
            size--;

        };
        return list;
    }

    @Override
    public String toString() {
        return "list=" + Arrays.toString(list);
    }
    public void clear(){
        int[] newlist = new int[0];
        list = newlist;
        size = 0;
    }
    public int size(){
        return this.size;
    }
    public boolean contains(int element){
        for (int a:list) {
            if(a == element){
                return true;
            }
        }
        return false;
    }
    public int indexOff(int element){
        int counter = 0;
        for (int e:list) {
            if(e == element){
                return counter;
            }
            counter++;
        }
        return -1;
    }
    public int[] set(int index, int element){
        if(index > list.length){
            throw new Error("Index is bigger than list size");
        }
        else{
            for (int i = 0; i < list.length; i++) {
                if(index == i){
                    list[i] = element;
                }
            }
        }
        return list;
    }
    public int[] fill(int element){
        for (int i = 0; i < list.length; i++) {
            list[i] = element;
        }
        return list;
    }
    public int[] concat(int[] mylist){
        int len = this.list.length + mylist.length;
        int[] newlist = new int[len];
        System.arraycopy(list, 0 , newlist,0, list.length - 1);
        System.arraycopy(mylist, 0, newlist, list.length, mylist.length);
        list = newlist;
        return list;
    }

}
