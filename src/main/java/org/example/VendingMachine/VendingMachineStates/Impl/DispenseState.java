package org.example.VendingMachine.VendingMachineStates.Impl;

import org.example.VendingMachine.Coin;
import org.example.VendingMachine.Item;
import org.example.VendingMachine.VendingMachine;
import org.example.VendingMachine.VendingMachineStates.State;

import java.util.List;

public class DispenseState implements State {
    DispenseState(VendingMachine machine,int codeNumber) throws Exception {
        System.out.println("currenly vending machine is in dispenseState");
        dispenseProduct(machine,codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can't insert coin in despense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("you can't click on start product selection button in despense state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can't insert coin in despense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can't choose product in despense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can't be returned in despense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been despensed");
        Item item=machine.getInventory().getInventory().getItem(codeNumber);
        machine.setInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState());
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("money can't be refunded in despense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can't be updated in despense state");
    }
}
