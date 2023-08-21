package org.example;

public class DoublyLinkedList<E>{
    private class Node<E> {
        private E element;
        private Node<E> previous;
        private Node<E> next;
        public Node(E element, Node<E> previous, Node<E> next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }
        public E getElement() {
            return this.element;
        }
        public Node<E> getPrevious() {
            return this.previous;
        }
        public Node<E> getNext() {
            return this.next;
        }
        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;
    public DoublyLinkedList(){
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, this.header, null);
        this.header.setNext(this.trailer);
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
        return this.header.getNext().getElement();
    }
    public E getLast() {
        if (this.isEmpty())
            return null;
        return this.trailer.getPrevious().getElement();
    }
    public void addFirst(E element) {
        this.addBetween(element, this.header, this.header.getNext());
    }
    public void addLast(E element) {
        this.addBetween(element, this.trailer.getPrevious(), this.trailer);
    }
    public E removeFirst() {
        if (this.isEmpty())
            return null;
        return this.remove(this.header.getNext());
    }
    public E removeLast() {
        if (this.isEmpty())
            return null;
        return this.remove(this.trailer.getPrevious());
    }
    private void addBetween(E element, Node<E> prevNode, Node<E> nextNode) {
        Node<E> newNode = new Node<>(element, prevNode, nextNode);
        prevNode.setNext(newNode);
        nextNode.setPrevious(newNode);
        this.size++;
    }
    private E remove(Node<E> node) {
        Node<E> prevNode = node.getPrevious();
        Node<E> nextNode = node.getNext();
        prevNode.setNext(nextNode);
        nextNode.setPrevious(prevNode);
        size--;
        return node.getElement();
    }
}
