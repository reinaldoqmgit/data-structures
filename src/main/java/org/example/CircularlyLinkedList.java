package org.example;

public class CircularlyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
        public E getElement() {
            return this.element;
        }
        public Node<E> getNext() {
            return this.next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    private Node<E> tail = null;
    private int size = 0;
    public CircularlyLinkedList() {

    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public E getFirst() {
        if (this.isEmpty())
            return null;
        return this.tail.getNext().getElement();
    }
    public E getLast() {
        if (this.isEmpty())
            return null;
        return this.tail.getElement();
    }
    public void rotate() {
        if (!this.isEmpty())
            this.tail = tail.getNext();
    }
    public void addFirst(E element) {
        if (this.isEmpty()) {
            this.tail = new Node<>(element, null);
            tail.setNext(tail);
        }
        else {
            Node<E> newNode = new Node<>(element, this.tail.getNext());
            this.tail.setNext(newNode);
        }
        this.size++;
    }
    public void addLast(E element) {
        this.addFirst(element);
        this.tail = this.tail.getNext();
    }
    public E removeFirst() {
        if (this.isEmpty())
            return null;
        E answer = this.tail.getNext().getElement();
        if (this.size == 1)
            this.tail = null;
        else
            this.tail.setNext(this.tail.getNext().getNext());
        size--;
        return answer;
    }
}
