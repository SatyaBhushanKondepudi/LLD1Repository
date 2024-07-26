package org.bhushan.lld120072024.LLD1_Class4;

public class Mammal extends Animal {
    Mammal(String name) {
        super(name);
        System.out.println("Mammal Constructor");
    }

    public void whoAmI(){
        System.out.println("I am a Mammal");
    }
}
