package org.example.ParkingLot.gates;

import org.example.ParkingLot.parkingLot.ParkingLot;
import org.example.ParkingLot.parkingLot.ParkingSpot;
import org.example.ParkingLot.payment.PaymentService;
import org.example.ParkingLot.vehicles.Vehicle;
import org.example.ParkingLot.vehicles.VehicleFactory;

public class ExitGate {
    private ParkingLot parkingLot;
    private PaymentService paymentService;

    public ExitGate(PaymentService paymentService, ParkingLot parkingLot) {
        this.paymentService = paymentService;
        this.parkingLot = parkingLot;
    }

    public void processExit(int spotNumber,int hoursStayed){
        ParkingSpot spot=parkingLot.getSpotByNumber(spotNumber);
        if (spot==null || !spot.isOccupied()){
            System.out.println("invalid or vacant spot");
            return;
        }
        Vehicle vehicle=spot.getVehicle();
        if(vehicle==null){
            System.out.println("no vehicle found in the spot");
            return;
        }

        double fee=vehicle.calculateFee(hoursStayed);
        paymentService.processPayment(fee);

        parkingLot.vacateSpot(spot,vehicle);
        System.out.println("spot vacated successfully");

    }
}
