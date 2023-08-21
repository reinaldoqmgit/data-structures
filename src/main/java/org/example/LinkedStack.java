package org.example;

public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E> singlyLinkedList = new SinglyLinkedList<>();
    public LinkedStack() {

    }
    @Override
    public int size() {
        return this.singlyLinkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.singlyLinkedList.isEmpty();
    }

    @Override
    public void push(E element) {
        this.singlyLinkedList.addFirst(element);
    }

    @Override
    public E top() {
        return this.singlyLinkedList.getFirst();
    }

    @Override
    public E pop() {
        return this.singlyLinkedList.removeFirst();
    }
}
