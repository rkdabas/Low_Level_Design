package org.example.ParkingLot.payment;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount){
        System.out.println("Processing UPI payment of $"+amount);
    }
}
