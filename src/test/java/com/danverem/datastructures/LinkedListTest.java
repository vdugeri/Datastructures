/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures;

import com.danverem.datastructures.exceptions.EmptyListException;
import com.danverem.datastructures.helpers.ListNode;
import com.danverem.datastructures.objects.Car;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Verem
 */
public class LinkedListTest {
    private LinkedList<Car> cars;

    public LinkedListTest() {
        cars = new LinkedList<>();
    }

    /**
     * Test of insertAtTail method, of class LinkedList.
     */
    @Test
    public void testInsertAtTail() {
        System.out.println("insertAtTail");

        Car toyota = new Car("Toyota");
        Car kia = new Car("Kia");

        Car expResult = kia;

        cars.insertAtTail(toyota);
        ListNode result = cars.insertAtTail(kia);

        assertEquals(expResult, result.value);
    }

    /**
     * Test of insertAtHead method, of class LinkedList.
     */
    @Test
    public void testInsertAtHead() {
        System.out.println("insertAtHead");

        Car audi = new Car("Audi");

        Car expResult = audi;

        ListNode result = cars.insertAtHead(audi);

        assertEquals(expResult, result.value);
    }

    /**
     * Test of removeTail method, of class LinkedList.
     * @throws com.danverem.datastructures.exceptions.EmptyListException
     */
    @Test
    public void testRemoveTail() throws EmptyListException {
        System.out.println("removeTail");

        Car hyundai = new Car("Hyundai");
        Car toyota = new Car("Toyota");

        cars.insertAtTail(hyundai);
        cars.insertAtTail(toyota);

        Car expResult = hyundai;
        ListNode result = cars.removeTail(); // removes toyota

        assertEquals(expResult, result.value);
    }

    /**
     * Test of removeHead method, of class LinkedList.
     * @throws com.danverem.datastructures.exceptions.EmptyListException
     */
    @Test
    public void testRemoveHead() throws EmptyListException {
        System.out.println("removeHead");

        Car hyundai = new Car("Hyundai");
        Car toyota = new Car("Toyota");

        cars.insertAtHead(hyundai);
        cars.insertAtTail(toyota);

        Car expResult = hyundai;
        ListNode result = cars.removeHead();

        assertEquals(expResult, result.value);
    }

}
