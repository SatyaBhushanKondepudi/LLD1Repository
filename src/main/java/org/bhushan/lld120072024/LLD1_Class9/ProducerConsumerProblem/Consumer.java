package org.bhushan.lld120072024.LLD1_Class9.ProducerConsumerProblem;

import java.util.Queue;

public class Consumer implements  Runnable{
    private Queue<Object> queue;
    private String name;
    private int maxSize;

    public Consumer(Queue<Object> queue, String name, int maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true){
            if(this.queue.size() > 0){
                System.out.println(this.name +" Removing an Object from the queue . Size : "+
                        this.queue.size());
                queue.remove();
            }
        }

    }
}
