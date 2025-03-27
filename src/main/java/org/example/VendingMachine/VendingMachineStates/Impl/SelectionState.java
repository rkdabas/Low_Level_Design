package org.example.VendingMachine.VendingMachineStates.Impl;

import org.example.VendingMachine.Coin;
import org.example.VendingMachine.Item;
import org.example.VendingMachine.VendingMachine;
import org.example.VendingMachine.VendingMachineStates.State;

import java.util.List;

public class SelectionState implements State {
    public SelectionState(){
        System.out.println("currently vending machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can't click on the insert button in selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can't insert coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        Item item=machine.getInventory().getItem(codeNumber);

        int paidByUser=0;
        for(Coin coin:machine.getCoinList()){
            paidByUser=paidByUse+coin.value;
        }

        if(paidByUser < item.getPrice()){
            System.out.println("Insufficient amount, Product you selected is for price: "+item.getPrice() + " and you paid: "+paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        }
        else{
            if(paidByUser>item.getPrice()){
                getChange(paidByUser-item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine,codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("returned the change in coin despense tray: "+returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can't be despensed in selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount in the coin despense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can't be updated in selection state");
    }
}
