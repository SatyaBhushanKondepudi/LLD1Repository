package org.bhushan.lld120072024.LLD1_Class9.MutexSolution_PCProblem.ProducerConsumerProblem;

import java.util.Queue;

public class Producer implements  Runnable{
    private Queue<Object> queue;
    private String name;
    private int maxSize;

    public Producer(Queue<Object> queue, String name, int maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true){
            synchronized (queue){
                if(this.queue.size() < maxSize){
                    System.out.println(this.name +" Adding an element to the queue. Size : "+
                            this.queue.size());
                    queue.add(new Object());
                    System.out.println(this.name +" AFTER: Adding an element to the queue. Size : "+
                            this.queue.size());
                }
            }
        }


    }
}
