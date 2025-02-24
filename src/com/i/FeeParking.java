package com.i;

public class FeeParking implements ParkingLot {
    private int capacity = 50;

    @Override
    public void parkCar() {
        System.out.println("Car parked.");
    }

    @Override
    public void unparkCar() {
        System.out.println("Car unparked.");
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    public double calculateFee(Car car) {
        return 10.0; // Example fee calculation
    }

    public void doPayment(Car car) throws Exception {
        throw new Exception("Parking lot is free");
    }
}
