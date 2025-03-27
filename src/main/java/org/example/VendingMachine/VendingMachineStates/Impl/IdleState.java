package org.example.VendingMachine.VendingMachineStates.Impl;

import org.example.VendingMachine.Coin;
import org.example.VendingMachine.Item;
import org.example.VendingMachine.VendingMachine;
import org.example.VendingMachine.VendingMachineStates.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {
    public IdleState(){
        System.out.println("currently vending machine is in idle state");
    }

    public IdleState(VendingMachine machine){
        System.out.println("currently vending machine is in idle state");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception{
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on the insert_coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("first you need to click on the insert_coin button");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("first you need to click on the insert_coin button");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("first you need to click on the insert_coin button");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("first you need to click on the insert_coin button");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on the insert_coin button");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.setInventory().addItem(item,codeNumber);
    }
}
