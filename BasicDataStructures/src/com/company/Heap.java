package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Heap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> race = new ArrayList<>(); //dynamic array
        PriorityQueue<Double> min_heap = new PriorityQueue<>();
        while (true){
            String in = sc.next(); // take string input
            if(in.equalsIgnoreCase("q")) {
                break;
            }
            race.add(Double.parseDouble(in));
        }
        ArrayList<Double> filter = new ArrayList<>();
        for (int i = 0; i < race.size() ; i++) {
            if(race.get(i)!=42.195){
                filter.add(race.get(i));
            }
        }

        for (int i = 0; i < filter.size() ; i++) {
            min_heap.add(filter.get(i));
            if(min_heap.size()>3){
                min_heap.poll();
            }

            min_heap.is

        }
        ArrayList<Double> x = new ArrayList<>(min_heap);
        x.sort(Collections.reverseOrder());
        System.out.println(x);
    }
}
