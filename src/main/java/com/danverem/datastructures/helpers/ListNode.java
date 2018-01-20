package com.danverem.datastructures.helpers;

/**
 *
 * @author Verem
 * @param <T>
 */
public class ListNode<T> {

    public T value;
    public ListNode<T> next;

    public ListNode(T value) {
        this.value = value;
        this.next = null;
    }
}
