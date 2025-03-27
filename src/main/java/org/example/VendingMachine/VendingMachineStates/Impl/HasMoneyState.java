package org.example.VendingMachine.VendingMachineStates.Impl;

import org.example.VendingMachine.Coin;
import org.example.VendingMachine.Item;
import org.example.VendingMachine.VendingMachine;
import org.example.VendingMachine.VendingMachineStates.State;

import java.util.List;

public class HasMoneyState implements State {
    public HasMoneyState(){
        System.out.println("currently vending machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you need to click on the start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoneyState");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can't be dispensed in hasMoneyState");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("returned the full amount in the coin despense tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can't be updated in hasMoneyState");
    }
}
