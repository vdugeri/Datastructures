package com.danverem.datastructures;

import com.danverem.datastructures.exceptions.EmptyListException;
import com.danverem.datastructures.helpers.ListNode;
import java.util.Iterator;

/**
 *
 * @author Verem
 * @param <T>
 */
public class LinkedList<T> implements Iterable<T> {

    private ListNode head;
    private ListNode tail;
    private int size;

    public LinkedList() {
        this.head = this.tail = null;
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

        if (tail == null) {
            tail = head = node;
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

        if (head == tail || head.next == null) {
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

    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            ListNode<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
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

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(3);
        list.insertAtTail(22);
        list.insertAtTail(35);
        list.insertAtTail(55);



        for (Integer i : list) {
            System.out.print(i + "=>");
        }
    }
}
