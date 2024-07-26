package org.bhushan.lld120072024.LLD1_Class6.introToThreads;

public class HelloWorldPrinter implements Runnable {
    public void run() {
        System.out.println(
                "Hello World - name : " + Thread.currentThread().getName()
        );
    }
}
