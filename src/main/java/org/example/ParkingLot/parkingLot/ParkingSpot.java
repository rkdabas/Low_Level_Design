package org.example.ParkingLot.parkingLot;

import org.example.ParkingLot.vehicles.Vehicle;

public abstract class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    public Vehicle vehicle;
    private String spotType;

    public ParkingSpot(int spotNumber,String spotType){
        this.spotNumber=spotNumber;
        this.spotType=spotType;
        this.isOccupied=false;
    }

    public boolean isOccupied(){return isOccupied;}

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle){
        if(isOccupied){
            throw new IllegalStateException("spot is occupied");
        }
        if(!canParkVehicle(vehicle)){
            throw new IllegalArgumentException("this spot is not suitable for parking of your vehicle");
        }
        this.vehicle=vehicle;
        this.isOccupied=true;
    }

    public void vacate(){
        if(!isOccupied){
            throw new IllegalStateException("spot is already vacant");
        }
        this.vehicle=null;
        this.isOccupied=false;
    }

    public int getSpotNumber() {
        return spotNumber;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public String getSpotType() {
        return spotType;
    }


    @Override
    public String toString(){
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", isOccupied=" + isOccupied +
                ", vehicle=" + (vehicle!=null ? vehicle.getLicencePlate() : "empty spot") +
                '}';
    }

}
