package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 15; i++) {
            myLinkedList.add(i);
        }
        myLinkedList.addFirst(100);
        myLinkedList.addLast(500);
        myLinkedList.removeFirst();
        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
    }
}
