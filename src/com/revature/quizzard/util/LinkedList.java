package com.revature.quizzard.util;

public class LinkedList<T> implements List<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    @Override
    public boolean add(T data) {
        if (data == null) {
            return false;
        }
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            tail = head = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean contains(T data) {
        Node<T> runner = head;
        while (runner != null) {
            if (runner.data.equals(data)) {
                return true;
            }
            runner = runner.nextNode;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(T data) {
        if ((data == null) || (head == null)) {
            return false;
        } else if (head.data.equals(data)) {
            head = head.nextNode;
            size--;
            return true;
        }
        Node<T> runner = head;
        while (runner != null) {
            if (runner.nextNode.data.equals(data)) {
                runner.nextNode = runner.nextNode.nextNode;
                if (runner.nextNode == null) {
                    tail = runner;
                }
                size--;
                return true;
            }
            runner = runner.nextNode;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void defaultMethodExample() {

    }

    public static void  staticMethodExample() {

    }

    private static class Node<T> {
        T data;
        Node<T> nextNode;

        public Node(T data) {
            this.data = data;
        }
    }
}
