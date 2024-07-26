package org.bhushan.lld120072024.LLD1_Class10.generics;

public class Client {
    public static void main(String[] args) {
//        demoPair();
//        demoGenericPair();
        demoGenericMethod();
    }

    private static void demoGenericMethod() {
        int ans = GenericMethods.genericMethod("India" , 141 , null);
        System.out.println(ans);
        System.out.println(GenericPair.fun("India" , "Democratic"));

    }

    private static void demoPair() {
        Pair P1 = new Pair();
        P1.first = 140;
        P1.second = "India";

        String name = (String) P1.first;
        double x = (double) P1.second;
        System.out.println(name);
        System.out.println(x);
        Pair P2 = new Pair();
    }

    private static void demoGenericPair() {
        GenericPair<String,Integer> P1 = new GenericPair<String,Integer>();
        // Generics will not allow to do wrong datatypes
//        P1.setFirst(140);
//        P1.setSecond(120);
        P1.setFirst("India"); P1.setSecond(140);
        System.out.println(P1.getFirst());
        System.out.println(P1.getSecond());
//        System.out.println(P1);

        GenericPair<Double , Double> P2 = new GenericPair<>();
        P2.setFirst(20.124);
        P2.setSecond(23.456);
        System.out.println(P2.getFirst());
        System.out.println(P2.getSecond());
//        System.out.println(P2);
    }
}
