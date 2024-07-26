package org.bhushan.lld120072024.LLD1_Class10.generics;

public class GenericPair<F,S> {
    private F first;
    private S second;

//    public GenericPair(F first, S second) {
//        this.first = first;
//        this.second = second;
//    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }


    public F getFirst() {
        return this.first;
    }
    public S getSecond() {
        return this.second;
    }

    public static <T,V> String fun(T tea, V vanilla) {
        return tea.toString() + vanilla.toString();
    }

}
