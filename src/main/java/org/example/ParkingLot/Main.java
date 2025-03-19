package org.example.ParkingLot;

import org.example.ParkingLot.gates.EntranceGate;
import org.example.ParkingLot.gates.ExitGate;
import org.example.ParkingLot.parkingLot.ParkingFloor;
import org.example.ParkingLot.parkingLot.ParkingLot;
import org.example.ParkingLot.payment.PaymentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

//        parking lot with 1 floor and 2 spots
        ParkingFloor floor=new ParkingFloor(1,2,2);
        ArrayList<ParkingFloor>floors=new ArrayList<>();
        floors.add(floor);
        ParkingLot parkingLot=new ParkingLot(floors);

//        payment service and passing scanner to it
        PaymentService paymentService=new PaymentService(scanner);

//        initialize gates
        EntranceGate entranceGate=new EntranceGate(parkingLot);
        ExitGate exitGate=new ExitGate(paymentService,parkingLot);

//        start the parking lot system
        System.out.println("!!!!! Welcome to the parking lot system !!!!!!");

//        continuous parking session until the user exits
        boolean exit=false;
        while(!exit){
            showMenu();
            int choice=getUserChoice(scanner);
            switch (choice){
                case 1:
                    parkVehicle(entranceGate);
                    break;

                case 2:
                    vacateSpot(exitGate,scanner);
                    break;

                case 3:
                    exit=true;
                    System.out.println("thanku for choosing our parking lot");
                    break;

                default:
                    System.out.println("invalid option: Please try again");
                    break;
            }

        }
        scanner.close();

    }


    private static void showMenu(){
        System.out.println("***********************");
        System.out.println("please choose an option from below: ");
        System.out.println("1. Park the vehicle");
        System.out.println("2. Vacate the vehicle spot");
        System.out.println("3. Exit the system");
        System.out.println("**********************");

    }

    private static int getUserChoice(Scanner scanner){
        return scanner.nextInt();
    }

    private static void parkVehicle(EntranceGate entranceGate){
        entranceGate.processEntrance();
    }

    private static void vacateSpot(ExitGate exitGate,Scanner scanner){
        System.out.println("enter the spot number to vacate");
        int spotNumber=scanner.nextInt();
        System.out.println("enter the number of hours the vehicle stayed");
        int hourStayed=scanner.nextInt();
        exitGate.processExit(spotNumber,hourStayed);
    }
}
