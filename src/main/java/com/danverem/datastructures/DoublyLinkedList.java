/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures;

import com.danverem.datastructures.exceptions.EmptyListException;
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
     * Deletes the head of the list and returns the new head.
     *
     * @return
     * @throws EmptyListException
     */
    public Node<T> removeHead() throws EmptyListException {
        if (head == null) {
            throw new EmptyListException("List is empty");
        }

        if (head.next != null) {
            head = head.next;
            head.previous = null;

            return head;
        }

        head = null;

        return head;
    }

    /**
     * Deletes the current tail and returns the new tail.
     *
     * @return
     * @throws EmptyListException
     */
    public Node<T> removeTail() throws EmptyListException {
        if (tail == null) {
            throw new EmptyListException("List is empty");
        }

        tail = tail.previous;

        return tail;
    }

    public int getSize() {
        return size;
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
