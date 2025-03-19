package org.example.ParkingLot.parkingLot;

import org.example.ParkingLot.vehicles.Vehicle;

import java.util.List;

public class ParkingLot {
    List<ParkingFloor>floors;

    public ParkingLot(List<ParkingFloor>floors){
        this.floors=floors;
    }

    public ParkingSpot findAvailableSpot(String vehicleType){
        for(ParkingFloor floor:floors){
            ParkingSpot spot=floor.findAvailableSpot(vehicleType);
            if(spot!=null){
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot spot=findAvailableSpot(vehicle.getVehicleType());
        if(spot!=null){
            spot.parkVehicle(vehicle);
            System.out.println("vehicle parked successfully in the spot "+ vehicle.getVehicleType());
            return spot;
        }
        System.out.println("no parking spot available for "+vehicle.getVehicleType());
        return null;
    }

    public void vacateSpot(ParkingSpot spot,Vehicle vehicle){
        if(spot!=null && spot.isOccupied() && spot.getVehicle().equals(vehicle)){
            spot.vacate();
            System.out.println(vehicle.getVehicleType() + "vacate the spot: "+spot.getSpotNumber());
        }
        else{
            System.out.println("invalid operation! either the spot is already vacant or vehicle does not match the spotType");
        }
    }

    public ParkingSpot getSpotByNumber(int spotNumber){
        for(ParkingFloor floor:floors){
            for(ParkingSpot spot:floor.getParkingSpots()){
                if(spot.getSpotNumber()==spotNumber){
                    return spot;
                }
            }
        }
        return null;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }
}
