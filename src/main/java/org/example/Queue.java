package org.example;

public interface Queue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E element);
    E getFirst(E element);
    E dequeue();
}
