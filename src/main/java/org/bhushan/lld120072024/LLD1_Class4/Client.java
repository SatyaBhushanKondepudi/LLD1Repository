package org.bhushan.lld120072024.LLD1_Class4;

public class Client {
    public static void main(String[] args) {
        demoInheritance();
    }

    private static void demoInheritance() {
//        Animal animal = new Mammal();
//        Lion lion = new Lion("Leo");
//        lion.fun();
//        lion.fun(5);
//        System.out.println("Debug");


        Animal animal = new Lion("Leo");
        animal.whoAmI();

    }
}

