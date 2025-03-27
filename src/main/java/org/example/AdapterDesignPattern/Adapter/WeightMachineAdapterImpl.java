package org.example.AdapterDesignPattern.Adapter;

import org.example.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine=weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPounds=weightMachine.getWeightInPounds();
        double weightInKg=weightInPounds*45;
        return weightInKg;
    }
}
