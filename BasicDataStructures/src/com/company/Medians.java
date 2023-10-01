package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class Medians {

    /** initialize your data structure here. */
    PriorityQueue<Integer> q1;
    PriorityQueue<Integer> q2;
    public Medians() {
        q1 = new PriorityQueue<>(Collections.reverseOrder()); //max heap
        q2 = new PriorityQueue<>(); //min heap
    }

    public void addNum(int num) {
        if(q1.isEmpty() || q1.peek()>num){
            q1.add(num);
        }else{
            q2.add(num);
        }
        if(q1.size()>q2.size()+1){
            q2.add(q1.peek());
            q1.poll();
        }else if(q2.size()>q1.size()+1){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    public double findMedian() {
        if(q1.size()>q2.size()){
            return q1.peek();
        }else if(q1.size()<q2.size()){
            return q2.peek();
        }
        return (q1.peek()+q2.peek())/2.0;
    }
}