/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
