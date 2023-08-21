package org.example;

public class LinkedQueue<E> implements Queue<E> {
    private SinglyLinkedList<E> singlyLinkedList = new SinglyLinkedList<>();
    public LinkedQueue() {

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
    public void enqueue(E element) {
        this.singlyLinkedList.addLast(element);
    }

    @Override
    public E getFirst() {
        return this.singlyLinkedList.getFirst();
    }

    @Override
    public E dequeue() {
        return this.singlyLinkedList.removeFirst();
    }
}
