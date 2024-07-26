package org.bhushan.lld120072024.LLD1_Class5;

public interface Animal {
    void move();
    void eat();
    default void fly(){
        System.out.println("Ooppss.. Can't fly");
    }
}
