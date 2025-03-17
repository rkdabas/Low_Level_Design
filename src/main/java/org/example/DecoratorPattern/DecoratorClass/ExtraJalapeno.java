package org.example.DecoratorPattern.DecoratorClass;

import org.example.DecoratorPattern.BaseClass.BasePizza;

public class ExtraJalapeno extends Toppings{
    BasePizza basePizza;

    public ExtraJalapeno(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost()+20;
    }
}
