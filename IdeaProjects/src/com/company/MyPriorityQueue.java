package com.company;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MyPriorityQueue extends PriorityQueue implements Cloneable{
    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<>();
        q1.offer("test1");
        q1.offer("test2");
        q1.offer("test3");
        PriorityQueue<String> q2 = new PriorityQueue<>();
        try {Object clone = clone(q1, q2);}
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

    private static Object clone(PriorityQueue x, PriorityQueue y) throws CloneNotSupportedException {
        Iterator<Object> pqIterator = x.iterator();
        while(pqIterator.hasNext()){
            y.offer(pqIterator.next());
        }
        return displayQueue(y);
    }
    public static Object displayQueue(PriorityQueue x){
        Iterator<Object> pqIterator = x.iterator();
        while(pqIterator.hasNext()){
            System.out.print(pqIterator.next()+ " ");
        }
        System.out.println();
        return x;
    }
}
