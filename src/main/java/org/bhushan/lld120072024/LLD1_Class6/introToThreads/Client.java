package org.bhushan.lld120072024.LLD1_Class6.introToThreads;

public class Client {
    public static void main(String[] args) {
        System.out.println(
                "Main Thread started - name : " + Thread.currentThread().getName()
        );
        Thread thread = new Thread(new HelloWorldPrinter());
        thread.start();
        Thread newthread = new Thread(new HelloWorldPrinter());
        newthread.start();
        Thread newthread1 = new Thread(new HelloWorldPrinter());
        newthread1.start();
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.run();
        //Main Thread started - name : main
        //Hello World - name : Thread-0
        //Hello World - name : main
        //Hello World - name : Thread-1



        for(int i=1 ; i<100 ; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread1 = new Thread(numberPrinter);
            thread1.start();
        }
    }
}
