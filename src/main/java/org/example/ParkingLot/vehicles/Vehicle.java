package org.example.ParkingLot.vehicles;

public abstract class Vehicle {
    private String licencePlate;
    private String vehicleType;

//    constructor
    public Vehicle(String licencePlate, String vehicleType){
        this.licencePlate=licencePlate;
        this.vehicleType=vehicleType;
    }

//      getters
    public String getLicencePlate() {
        return licencePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

//    calculating parking fee
    public abstract double calculateFee(int hoursStayed);
}
