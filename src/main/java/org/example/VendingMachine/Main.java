package org.example.VendingMachine;

import org.example.VendingMachine.VendingMachineStates.State;

public class Main {
    public static void main(String args[]) throws Exception{
        VendingMachine vendingMachine=new VendingMachine();
        try{
            System.out.println("|");
            System.out.println("Filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on the insert coin button");
            System.out.println("|");

            State vendingMachineState=vendingMachine.getVendingMachineState();
            vendingMachineState.clickOnInsertCoinButton(vendingMachine);

            vendingMachineState=vendingMachine.getVendingMachineState();
            vendingMachineState.insertCoin(vendingMachine,Coin.NICKLE);
            vendingMachineState.insertCoin(vendingMachine,Coin.QUARTER);

            System.out.println("|");
            System.out.println("clicking on the product selectio button");
            System.out.println("|");
            vendingMachineState.clickOnStartProductSelectionButton(vendingMachine);

            vendingMachineState=vendingMachine.getVendingMachineState();
            vendingMachineState.chooseProduct(vendingMachine,102);

            displayInventory(vendingMachine);

        }
        catch (Exception e){
            throw new Exception("something went wrong");
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine){
        ItemShelf[] slots=vendingMachine.getInventory().getInventory();
        for(int i=0;i< slots.length;i++){
            Item newItem=new Item();
            if(i>=0 && i<3){
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            }
            else if(i>=3 && i<5){
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(9);
            }
            else if(i>=5 && i<7){
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(15);
            }
            else if(i>=7 && i<10){
                newItem.setType(ItemType.SODA);
                newItem.setPrice(5);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine){
        ItemShelf[] slots=vendingMachine.getInventory().getInventory();
        for(int i=0;i<slots.length;i++){
            System.out.println("CodeNumber "+slots[i].getCode() +
                    "Item: " + slots[i].getItem().getType().name() +
                    "Price "+ slots[i].getItem().getPrice() +
                    "isAvailable " + !slots[i].isSoldOut());
        }
    }
}
