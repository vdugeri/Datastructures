/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures;

import com.danverem.datastructures.helpers.Node;
import java.util.Iterator;

/**
 *
 * @author Verem
 * @param <T>
 */
public class DoublyLinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    /**
     * Inserts at the head of the list and returns the new head.
     *
     * @param value
     * @return
     */
    public Node<T> insertAtHead(T value) {
        Node<T> node = new Node(value);

        if (head == null) {
            head = tail = node;

            size += 1;

            return head;
        }

        node.next = head;
        head.previous = node;

        head = node;

        size += 1;

        return head;
    }

    /**
     * Inserts at the end of list and returns the new tail.
     *
     * @param value
     * @return
     */
    public Node<T> insertAtTail(T value) {
        Node<T> node = new Node(value);

        if (tail == null) {
            tail = head = node;
        }

        tail.next = node;
        node.previous = tail;
        tail = node;

        return tail;
    }

    /**
     * Deletes the head of the list and returns the removed item.
     *
     * @return
     */
    public Node<T> removeHead() {
        if (head == null) {
            return null;
        }

        if (head.next != null) {
            Node<T> temp = head;
            head = head.next;
            head.previous = null;

            return temp;
        }

        Node<T> temp = head;
        head = null;
        tail = null;

        return temp;
    }

    /**
     * Deletes the current tail and returns the removed item.
     *
     * @return
     */
    public Node<T> removeTail() {
        if (tail == null) {
            return null;
        }

        if (tail.previous == null) {
            Node<T> temp = tail;
            tail = null;
            head = null;

            return temp;
        }

        Node<T> temp = tail;
        tail = temp.previous;
        tail.next = null;

        return temp;
    }

    public int getSize() {
        return size;
    }

    public Node<T> getHead() {
        return this.head;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> curr = head;

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    T value = curr.value;
                    curr = curr.next;

                    return value;
                }

                return null;
            }
        };
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> numbers = new DoublyLinkedList<>();
        numbers.insertAtHead(4);
        numbers.insertAtHead(6);
        numbers.insertAtTail(3);
        numbers.insertAtTail(7);

        for (Integer i : numbers) {
            System.out.print(i + "<=>");
        }
    }

}
