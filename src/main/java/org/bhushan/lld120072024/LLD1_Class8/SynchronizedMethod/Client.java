package org.bhushan.lld120072024.LLD1_Class8.SynchronizedMethod;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
//        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
//        ExecutorService t1 = Executors.newFixedThreadPool(10);
//        t1.submit(adder);
//        ExecutorService t2 = Executors.newFixedThreadPool(10);
//        t2.submit(subtractor);



        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.value);
    }
}
