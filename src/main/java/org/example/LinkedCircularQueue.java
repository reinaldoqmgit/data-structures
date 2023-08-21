package org.example;

public class LinkedCircularQueue<E> implements CircularQueue<E> {
    private CircularlyLinkedList<E> circularlyLinkedList = new CircularlyLinkedList<>();
    public LinkedCircularQueue() {

    }
    @Override
    public void rotate() {
        this.circularlyLinkedList.rotate();
    }

    @Override
    public int size() {
        return this.circularlyLinkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.circularlyLinkedList.isEmpty();
    }

    @Override
    public void enqueue(E element) {
        this.circularlyLinkedList.addLast(element);
    }

    @Override
    public E getFirst() {
        return this.circularlyLinkedList.getFirst();
    }

    @Override
    public E dequeue() {
        return this.circularlyLinkedList.removeFirst();
    }
}
