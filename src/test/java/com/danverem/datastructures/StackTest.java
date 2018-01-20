/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures;

import com.danverem.datastructures.exceptions.EmptyStackException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Verem
 */
public class StackTest {

    protected Stack<Integer> ages;

    public StackTest() {
        ages = new Stack(6);
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        Integer age = 22;
        Integer expResult = age;
        Integer result = ages.push(age);
        assertEquals(expResult, result);
        assertEquals(1, ages.size());
    }

    /**
     * Test of pop method, of class Stack.
     * @throws com.danverem.datastructures.exceptions.EmptyStackException
     */
    @Test
    public void testPop() throws EmptyStackException {
        ages.push(25);
        Integer expResult = 25;
        Integer result = ages.pop();
        assertEquals(expResult, result);
        assertEquals(0, ages.size());
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        ages.push(30);
        Integer expResult = 30;
        Integer result = ages.peek();
        assertEquals(expResult, result);
        assertEquals(1, ages.size());
    }

}
