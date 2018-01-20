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
