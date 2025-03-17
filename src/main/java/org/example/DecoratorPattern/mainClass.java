package org.example.DecoratorPattern;

import org.example.DecoratorPattern.BaseClass.BasePizza;
import org.example.DecoratorPattern.BaseClass.MargrettaPizza;
import org.example.DecoratorPattern.DecoratorClass.ExtraCheese;
import org.example.DecoratorPattern.DecoratorClass.ExtraJalapeno;

public class mainClass {
    public static void main(String args[]){
        BasePizza pizza1=new MargrettaPizza();
        System.out.println(pizza1.cost());

        BasePizza pizza2=new ExtraCheese(new MargrettaPizza());
        System.out.println(pizza2.cost());

        BasePizza pizza3=new ExtraCheese(new ExtraJalapeno(new MargrettaPizza()));
        System.out.println(pizza3.cost());
    }
}
