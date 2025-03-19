package org.example.ParkingLot.vehicles;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType, String licencePlate){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new CarVehicle(licencePlate);
        }
        else if(vehicleType.equalsIgnoreCase("Bike")){
            return new BikeVehicle(licencePlate);
        }
        return null;  // for unsupported vehicles type
    }
}
