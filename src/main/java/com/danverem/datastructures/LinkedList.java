/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures;

import com.danverem.datastructures.exceptions.EmptyListException;
import com.danverem.datastructures.helpers.ListNode;
import java.util.Iterator;

/**
 *
 * @author Verem
 * @param <T>
 */
public class LinkedList<T> {

    private ListNode head;
    private ListNode tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = head;
        size = 0;
    }

    /**
     * Inserts a new current at end of list and returns the new tail.
     *
     * @param value
     * @return
     */
    public ListNode<T> insertAtTail(T value) {
        ListNode<T> node = new ListNode<>(value);

        if (size == 0) {
            head = tail = node;
            size += 1;

            return tail;
        }

        tail.next = node;
        tail = tail.next;
        size += 1;

        return tail;
    }

    /**
     * Inserts a new current at the head of the list and returns the new head.
     *
     * @param value
     * @return
     */
    public ListNode<T> insertAtHead(T value) {
        ListNode<T> node = new ListNode<>(value);

        if (head == null) {
            head = tail = node;
            size += 1;

            return head;
        }

        node.next = head;
        head = node;
        size += 1;

        return head;
    }

    /**
     * Removes and returns the new tail of the list.
     *
     * @return
     * @throws EmptyListException
     */
    public ListNode<T> removeTail() throws EmptyListException {
        if (tail == null) {
            throw new EmptyListException("List is empty. Cannot remove tail");
        }

        if (tail == head) {
            ListNode<T> temp = tail;
            head = tail = null;
            size -= 1;

            return temp;
        }

        ListNode<T> curr = head;
        while (curr.next != tail) {
            curr = curr.next;
        }

        curr.next = null;
        tail = curr;
        size -= 1;

        return tail;
    }

    public ListNode<T> removeHead() throws EmptyListException {
        if (head == null) {
            throw new EmptyListException("List is empty. Cannot remove head");
        }

        if (head == tail) {
            ListNode<T> temp = head;
            head = tail = null;
            size -= 1;

            return temp;
        }

        ListNode<T> temp = head;
        head = head.next;
        size -= 1;

        return temp;
    }

    public Iterator iterator() {
        return new Iterator() {
            ListNode<T> current = head;

            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    T value = current.value;
                    current = current.next;

                    return value;
                }

                return null;
            }
        };
    }
}
