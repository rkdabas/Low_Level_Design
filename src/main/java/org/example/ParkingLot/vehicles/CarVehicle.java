package org.example.ParkingLot.vehicles;

public class CarVehicle extends Vehicle {
    private static final double RATE=10.0;    // 10 rupee/hour for the car

    public CarVehicle(String licencePlate) {
        super(licencePlate, "Car");
    }


//    implement calculate fee for the car
    @Override
    public double calculateFee(int hoursStayed){
        return RATE*hoursStayed;
    }

}
