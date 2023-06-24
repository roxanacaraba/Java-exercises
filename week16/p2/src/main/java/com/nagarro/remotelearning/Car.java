package com.nagarro.remotelearning;

public class Car extends Vehicle {
    private String brand;

    public Car(String vehicleType, String fuelType, int numberOfWheels, String brand) {
        super(vehicleType, fuelType, numberOfWheels);
        this.brand = brand;
    }

    public void drive() {
        System.out.println(brand + " is driving");
    }
}