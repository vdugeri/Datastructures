/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures.helpers;

/**
 *
 * @author Verem
 */
public class Node<T> {

    public T value;
    public Node next;
    public Node previous;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
