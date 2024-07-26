package org.bhushan.lld120072024.LLD1_Class5.AbstractClasses;

public abstract class Mammal {
    int limbs ;
    String name ;

    abstract void move();
    void eat(){
        System.out.println("Mammals eat");
    }
}
