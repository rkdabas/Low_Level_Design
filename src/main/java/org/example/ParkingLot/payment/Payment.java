package org.example.ParkingLot.payment;

public class Payment{
    private double amount;
    private PaymentStrategy paymentStrategy;

    public Payment(double amount,PaymentStrategy paymentStrategy){
        this.amount=amount;
        this.paymentStrategy=paymentStrategy;
    }

//    process the payment using assigned strategy
    public void processPayment(){
        if(amount > 0){
            paymentStrategy.processPayment(amount);
        }
        else{
            System.out.println("invalid payment amount");
        }
    }
}
