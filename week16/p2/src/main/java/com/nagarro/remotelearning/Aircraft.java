package com.nagarro.remotelearning;

public class Aircraft extends Vehicle {
    private String aircraftModel;

    public Aircraft(String vehicleType, String fuelType, int numberOfWheels, String aircraftModel) {
        super(vehicleType, fuelType, numberOfWheels);
        this.aircraftModel = aircraftModel;
    }

    public void fly() {
        System.out.println(aircraftModel + " is flying");
    }
}