package org.bhushan.lld120072024.LLD1_Class9.SemaphoreSoln_PCProblem;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable{
    private Queue<Object> queue;
    private String name;
//    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Queue<Object> queue, String name,
                    Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.queue = queue;
        this.name = name;
//        this.maxSize = maxSize;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while(true){
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.name +" Removing an Object from the queue . Size : "+
                    this.queue.size());
            queue.remove();
            System.out.println(this.name +" AFTER: Removing an Object from the queue . Size : "+
                    this.queue.size());
            producerSemaphore.release();
        }

    }
}
