/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures;

import com.danverem.datastructures.helpers.Node;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Verem
 */
public class DoublyLinkedListTest {

    private final DoublyLinkedList<Integer> numbers;

    public DoublyLinkedListTest() {
        numbers = new DoublyLinkedList<>();
    }

    /**
     * Test of insertAtHead method, of class DoublyLinkedList.
     */
    @Test
    public void testInsertAtHead() {
        System.out.println("insertAtHead");

        Integer one = 1;
        Integer two = 2;
        Integer expResult = 2;

        numbers.insertAtHead(one);
        Node result = numbers.insertAtHead(two);

        assertEquals(expResult, result.value);
    }

    /**
     * Test of insertAtTail method, of class DoublyLinkedList.
     */
    @Test
    public void testInsertAtTail() {
        System.out.println("insertAtTail");

        Integer three = 3;
        Integer four = 4;
        Integer expResult = 4;

        numbers.insertAtTail(three);
        Node result = numbers.insertAtTail(four);

        assertEquals(expResult, result.value);
    }

    /**
     * Test of removeHead method, of class DoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemoveHead() throws Exception {
        System.out.println("removeHead");

        Integer five = 5;
        Integer six = 6;
        Integer expResult = five;

        numbers.insertAtHead(five);
        numbers.insertAtHead(six);

        Node result = numbers.removeHead();

        System.out.println("result:" + result);

        assertEquals(expResult, result.value);
    }

    /**
     * Test of removeTail method, of class DoublyLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemoveTail() throws Exception {
        System.out.println("removeTail");

        Integer seven = 7;
        Integer eight = 8;

        numbers.insertAtTail(seven);
        numbers.insertAtTail(eight);

        Integer expResult = 7;
        Node result = numbers.removeTail();

        assertEquals(expResult, result.value);
    }

}
