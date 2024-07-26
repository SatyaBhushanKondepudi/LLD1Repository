package org.bhushan.lld120072024.LLD1_Class7.executors;

public class NumberPrinter implements  Runnable{
    private int number;
    NumberPrinter(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println(
                "Printing Number:" + this.number + Thread.currentThread().getName()
        );
    }
}
