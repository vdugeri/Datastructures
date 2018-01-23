package com.danverem.datastructures;

import com.danverem.datastructures.exceptions.EmptyListException;
import com.danverem.datastructures.helpers.Node;
import java.util.Iterator;

/**
 *
 * @author Verem
 * @param <T>
 */
public class Queue<T> implements Iterable<T> {

    private Node<T> front;
    private Node<T> back;
    private int size;

    public Queue() {
        this.front = this.back = null;
        this.size = 0;
    }

    /**
     * Adds an element to the back of the queue and returns the new back.
     *
     * @param value
     * @return
     */
    public Node<T> enqueue(T value) {
        Node<T> node = new Node(value);
        if (back == null) {
            back = front = node;
            size += 1;

            return node;
        }

        back.next = node;
        node.previous = back;
        back = node;
        size += 1;

        return back;
    }

    /**
     * Removes and returns the removed element.
     *
     * @return
     * @throws EmptyListException
     */
    public Node<T> dequeue() throws EmptyListException {
        if (size == 0) {
            throw new EmptyListException("Queue is empty. Cannot remove element");
        }

        Node<T> temp = front;
        front = front.next;

        return temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> curr = front;

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

    public static void main(String[] args) throws EmptyListException {
        Queue<Integer> q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        for (Integer i : q) {
            System.out.println(i);
        }

        q.dequeue();

        System.out.println("****");

        for (Integer i : q) {
            System.out.println(i);
        }
    }

}
