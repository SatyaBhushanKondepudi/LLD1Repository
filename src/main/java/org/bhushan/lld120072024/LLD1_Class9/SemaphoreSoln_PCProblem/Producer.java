package org.bhushan.lld120072024.LLD1_Class9.SemaphoreSoln_PCProblem;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements  Runnable{
    private Queue<Object> queue;
    private String name;
//    private int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Queue<Object> queue, String name,
                    Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.queue = queue;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
//        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.name +" Adding an element to the queue. Size : "+
                        this.queue.size());
            queue.add(new Object());
            System.out.println(this.name +" AFTER: Adding an element to the queue. Size : "+
                    this.queue.size());
            consumerSemaphore.release();
        }


    }
}
