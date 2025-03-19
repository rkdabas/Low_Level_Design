package org.example.ParkingLot.parkingLot;

import java.util.ArrayList;
import java.util.List;


public class ParkingFloor {
    private List<ParkingSpot>parkingSpots;
    int floorNumber;

    public ParkingFloor(int floorNumber, int numCarSpots, int numBikeSpots) {
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();


//        add car spots
        for (int i = 0; i < numCarSpots; i++) {
            this.parkingSpots.add(new CarParkingSpot(i + 1));
        }
//        add bike spots
        for (int i = 0; i < numBikeSpots; i++) {
            this.parkingSpots.add(new BikeParkingSpot(i + 1));
        }
    }

        public ParkingSpot findAvailableSpot(String vehicle_type){
            for(ParkingSpot spot:parkingSpots){
                if(!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vehicle_type)){
                    return spot;
                }
            }
            return null;
        }

        public List<ParkingSpot> getParkingSpots(){return parkingSpots;}

}
