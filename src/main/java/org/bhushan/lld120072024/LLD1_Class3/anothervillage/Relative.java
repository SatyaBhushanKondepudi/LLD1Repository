package org.bhushan.lld120072024.LLD1_Class3.anothervillage;

import org.bhushan.lld120072024.LLD1_Class3.village.Family;

public class Relative extends Family {
    protected String relative ;
    String aged_relative ;
    // Different Package - Child Class :: Public , Protected
    public void checkAccess(){
        System.out.println(publicAttribute);
        System.out.println(protectedAttribute);
    }
}
