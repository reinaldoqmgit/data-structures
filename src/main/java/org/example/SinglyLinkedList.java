package org.example;

public class SinglyLinkedList<E> {
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
            return next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList() {

    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public E getFirst() {
        if (this.isEmpty())
            return null;
        return this.head.getElement();
    }
    public E getLast() {
        if (this.isEmpty())
            return null;
        return this.tail.getElement();
    }
    public void addFirst(E element) {
        head = new Node<>(element, head);
        if (this.isEmpty())
            this.tail = head;
        this.size++;
    }
    public void addLast(E element) {
        Node<E> newTail = new Node<>(element, null);
        if (this.isEmpty())
            head = newTail;
        else
            tail.setNext(newTail);
        this.tail = newTail;
        this.size++;
    }
    public E removeFirst() {
        if (this.isEmpty())
            return null;
        E ans = head.getElement();
        this.head = head.getNext();
        if (this.head == null)
            this.tail = null;
        size--;
        return ans;
    }
}
