package org.bhushan.lld120072024.LLD1_Class8.SynchronizedMethod;

public class Count {
    int value = 0 ;

    public synchronized void incrementValue(int offset) {
        this.value += offset;
    }

    public int getValue() {
        return this.value;
    }

    public void decrementValue(int offset) {
        this.value -= offset;
    }
}
