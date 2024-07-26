package org.bhushan.lld120072024.LLD1_Class3.village;

public class Client {
    public static void main(String[] args) {
        demoAccess();
    }

    // Outside class same package :: Public , Private , Default
    public static void demoAccess() {
        Family family = new Family();

        System.out.println(family.publicAttribute);
        System.out.println(family.protectedAttribute);
        System.out.println(family.defaultAttribute);
    }
}
