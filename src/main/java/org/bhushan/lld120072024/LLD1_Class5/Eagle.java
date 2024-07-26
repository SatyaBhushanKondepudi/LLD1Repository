package org.bhushan.lld120072024.LLD1_Class5;

public class Eagle implements Bird{
    @Override
    public void move() {
        System.out.println("Eagle moves");

    }

    @Override
    public void eat() {
        System.out.println("Eagle eats");

    }

    @Override
    public void fly() {
        System.out.println("Eagle flys");
    }
}
