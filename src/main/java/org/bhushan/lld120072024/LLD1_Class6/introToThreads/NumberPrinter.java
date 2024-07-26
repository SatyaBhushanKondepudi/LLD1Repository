package org.bhushan.lld120072024.LLD1_Class6.introToThreads;

public class NumberPrinter implements Runnable{
    private int number;
    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(
                "Printing number " + this.number + " " +
                        Thread.currentThread().getName())
        ;
    }
}
