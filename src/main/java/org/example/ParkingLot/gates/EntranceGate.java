package org.example.ParkingLot.gates;

import org.example.ParkingLot.parkingLot.ParkingLot;
import org.example.ParkingLot.parkingLot.ParkingSpot;
import org.example.ParkingLot.vehicles.Vehicle;
import org.example.ParkingLot.vehicles.VehicleFactory;

import java.util.Scanner;

public class EntranceGate {
    public ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void processEntrance(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the vehicle licence plate number");
        String licencePlate=scanner.next();
        System.out.println("enter the vehicle type");
        String vehicleType=scanner.next();

        Vehicle vehicle= VehicleFactory.createVehicle(vehicleType,licencePlate);
        if(vehicle==null){
            System.out.println("invalid vehicle type: only bike and car are allowed");
            return;
        }
//       park the vehicle
        ParkingSpot spot=parkingLot.parkVehicle(vehicle);
        if(spot!=null){
            System.out.println("vehicle parked successfully in spot: "+spot.getSpotNumber());
        }
        else{
            System.out.println("no available spots for the vehicle type: "+vehicleType);
        }

    }
}
