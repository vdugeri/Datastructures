/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danverem.datastructures.objects;

/**
 *
 * @author Verem
 */
public class Car {
    private final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + '}';
    }

}
