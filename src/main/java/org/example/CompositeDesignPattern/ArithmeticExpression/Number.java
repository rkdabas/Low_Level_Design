package org.example.CompositeDesignPattern.ArithmeticExpression;

import java.util.Enumeration;

public class Number implements ArithmeticExpression{
    int value;
    public Number(int value){
        this.value=value;
    }

    @Override
    public int evaluate(){
        System.out.println("Number is "+ value);
        return value;
    }
}
