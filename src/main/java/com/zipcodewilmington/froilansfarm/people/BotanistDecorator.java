package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.produce.Crop;

public class BotanistDecorator extends Person{

    Animal p;


    public BotanistDecorator(Animal decoratedPerson) {
        this.p = decoratedPerson;
    }

    public void plant(){
        System.out.println("Planting");
    }

    @Override
    public void work() {
        p.work();
        this.plant();
    }
}
