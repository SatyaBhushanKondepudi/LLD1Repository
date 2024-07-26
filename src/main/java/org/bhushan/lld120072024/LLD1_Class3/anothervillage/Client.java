package org.bhushan.lld120072024.LLD1_Class3.anothervillage;

import org.bhushan.lld120072024.LLD1_Class3.village.Family;

public class Client {
    public static void main(String[] args) {
        demoAccess();
    }

    // Outside the Package :: Public
    public static void demoAccess() {
        Family family = new Family();
        System.out.println(family.publicAttribute);
    }
}
