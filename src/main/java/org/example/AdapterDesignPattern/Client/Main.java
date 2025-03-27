package org.example.AdapterDesignPattern.Client;

import org.example.AdapterDesignPattern.Adaptee.WeightMachineImpl;
import org.example.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import org.example.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String args[]){
        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
