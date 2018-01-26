package com.danverem.datastructures;

import com.danverem.datastructures.exceptions.EmptyListException;
import com.danverem.datastructures.helpers.Node;
import java.util.Iterator;

/**
 *
 * @author Verem
 * @param <T>
 */
public class Dequeue<T> implements Iterable<T> {

    private final DoublyLinkedList<T> dequeue;

    public Dequeue() {
        dequeue = new DoublyLinkedList<>();
    }

    public T addToFront(T value) {
        Node<T> node = dequeue.insertAtHead(value);

        return node.value;
    }

    public T removeFromFront() throws EmptyListException {
        Node<T> node = dequeue.removeHead();

        return node.value;
    }

    public T addToBack(T value) {
        Node<T> node = dequeue.insertAtTail(value);

        return node.value;
    }

    public T removeFromBack() throws EmptyListException {
        Node<T> node = dequeue.removeTail();

        return node.value;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> curr = dequeue.getHead();

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
        Dequeue<Integer> ages = new Dequeue<>();

        ages.addToFront(1);
        ages.addToBack(8);
        ages.addToFront(2);
        ages.addToBack(7);
        ages.addToFront(3);
        ages.addToBack(6);
        ages.addToFront(4);
        ages.addToBack(5);

        for (Integer i : ages) {
            System.out.println(i);
        }

        System.out.println("******");

        System.out.println(ages.removeFromBack());
        System.out.println(ages.removeFromBack());
        System.out.println(ages.removeFromBack());
        System.out.println(ages.removeFromBack());
        System.out.println(ages.removeFromBack());
    }

}
