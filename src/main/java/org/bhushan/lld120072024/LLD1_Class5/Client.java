package org.bhushan.lld120072024.LLD1_Class5;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoInterface();
    }

    private static void demoInterface() {
        Lion lion = new Lion();
        lion.eat();
        lion.move();
        lion.fly();

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(new Eagle());

        for(Animal animal : animals){
            animal.fly();
        }





    }
}
