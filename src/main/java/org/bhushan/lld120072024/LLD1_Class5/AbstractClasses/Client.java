package org.bhushan.lld120072024.LLD1_Class5.AbstractClasses;

public class Client {
    public static void main(String[] args) {
        demoAbstractClass();
    }
    public static void demoAbstractClass() {
        Tiger tiger = new Tiger();
        tiger.move();
//        Mammal mammal = new Tiger();
        Whale whale = new BlueWhale();
        whale.move();
    }

}
