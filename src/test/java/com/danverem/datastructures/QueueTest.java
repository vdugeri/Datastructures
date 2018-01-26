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
public class QueueTest {
    private final Queue<Integer> ages;

    public QueueTest() {
        ages = new Queue<>();
    }

    /**
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Integer value = 1;
        Node expResult = new Node<>(1);
        Node result = ages.enqueue(value);
        assertEquals(expResult.value, result.value);
    }

    /**
     * Test of dequeue method, of class Queue.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDequeue() throws Exception {
        System.out.println("dequeu");
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        for (Integer i : numbers) {
            ages.enqueue(i);
        }

        Node expResult = new Node<>(1);
        Node result = ages.dequeue();
        assertEquals(expResult.value, result.value);
    }

}
