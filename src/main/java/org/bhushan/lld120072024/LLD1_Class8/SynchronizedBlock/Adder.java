package org.bhushan.lld120072024.LLD1_Class8.SynchronizedBlock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Count count ;
//    private Lock lock;
    public Adder(Count count) {
        this.count = count;
//        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i=1 ; i<=10000 ; i++){
//            lock.lock();
            synchronized(count){
                System.out.println("Adder : " + i + " " + Thread.currentThread().getName());
                count.value += i;
            }
//            lock.unlock();
        }

    }
}
