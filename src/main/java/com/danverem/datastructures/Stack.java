/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures;

import com.danverem.datastructures.exceptions.EmptyStackException;

/**
 *
 * @author Verem
 * @param <T>
 */
public class Stack<T> {

    private final T[] items;
    private int top;

    public Stack(int capacity) {
        this.items = (T[]) new Object[capacity];
        top = 0;
    }

    public T push(T item) {
        items[top] = item;
        top += 1;
        System.out.println("top: " + top);
        return item;
    }

    public T pop() throws EmptyStackException {
        if (top == 0) {
            throw new EmptyStackException("Cannot pop from an empty stack");
        }

        top -= 1;

        return items[top];
    }

    public T peek() {
        if (top == 0) {
            return null;
        }

        return items[top - 1];
    }

    public int size() {
        return top;
    }
}
