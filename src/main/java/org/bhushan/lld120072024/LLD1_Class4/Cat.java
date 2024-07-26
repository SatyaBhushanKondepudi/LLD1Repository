package org.bhushan.lld120072024.LLD1_Class4;

public class Cat extends Mammal{
    Cat(String name){
        super(name);
        System.out.println("Cat Constructor");
    }
    public void whoAmI(){
        System.out.println("I am a Cat");
    }
}
