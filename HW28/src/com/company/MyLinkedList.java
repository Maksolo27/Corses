package com.company;

public class MyLinkedList<T> {
    private int size;
    private Node head;
    private Node tail;

    public void add(T elem){
        Node node = new Node();
        node.element = elem;
        if(head == null && tail == null && size == 0){
            head = node;
            tail = node;

        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }
    public void addFirst(T elem){
        Node node = new Node();
        node.element = elem;
        head.previous = node;
        node.next = head;
        head = node;
        size++;
    }
    public void addLast(T elem){
        Node node = new Node();
        node.element = elem;
        tail.previous = node;
        node.next = tail;
        tail = node;
        size++;
    }
    public T removeFirst(){
        T result = head.element;
        head = head.next;
        size--;
        return result;
    }
    public T removeLast(){
        T result = tail.element;
        tail = tail.next;
        size--;
        return result;
    }
    public T getFirst(){
        return head.element;
    }
    public T getLast(){
        return tail.element;
    }

    public int size(){
        return size;
    }
    private class Node{
        Node previous;
        T element;
        Node next;

    }
}
