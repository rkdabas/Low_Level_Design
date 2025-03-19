package org.example.ParkingLot.vehicles;

public class BikeVehicle extends Vehicle{
    private static final double RATE=5.0;    // 5 rupee/hour for the bike

    public BikeVehicle(String licencePlate) {
        super(licencePlate, "Bike");
    }


    //    implement calculate fee for the car
    @Override
    public double calculateFee(int hoursStayed){
        return RATE*hoursStayed;
    }
}
