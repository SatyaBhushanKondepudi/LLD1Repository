package org.bhushan.lld120072024.LLD1_Class10.generics;

public class GenericMethods {
    public static <T,X,Z> X genericMethod(T data1, X data2, Z data3) {
        System.out.println(data1+" "+data2+" "+data3);
        return data2 ;
    }
}
