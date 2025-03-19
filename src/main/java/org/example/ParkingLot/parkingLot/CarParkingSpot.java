package org.example.ParkingLot.parkingLot;

import org.example.ParkingLot.vehicles.Vehicle;

public class CarParkingSpot extends ParkingSpot{
    public CarParkingSpot(int spotNumber){
        super(spotNumber,"Car");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle){
        return "Car".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
