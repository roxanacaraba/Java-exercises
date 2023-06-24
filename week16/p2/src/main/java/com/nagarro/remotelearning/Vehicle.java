package com.nagarro.remotelearning;

public class Vehicle {
    private String vehicleType;
    private String fuelType;
    private int numberOfWheels;

    public Vehicle(String vehicleType, String fuelType, int numberOfWheels) {
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.numberOfWheels = numberOfWheels;
    }

    public void startEngine() {
        System.out.println("Engine started: " + vehicleType);
    }

    public void stopEngine() {
        System.out.println("Engine stopped: " + vehicleType);
    }
}