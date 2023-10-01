package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class SortedLists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abcd");
        list.add("efgh");
        list.add("ijkl");
        System.out.println(isSorted(list));
        for(int i=0;i<1000000;i++){
            if(i%28 ==5 && i%19==0 && i%21==5 && i%16==5){
                System.out.println(i);
                return;
            }
        }
        int[] x = new int[]{30,3};
        

    }

        public static <T extends Comparable> boolean isSorted(List<T> listOfT) {
            T previous = null;
            for (T t: listOfT) {
                if (previous != null && t.compareTo(previous) < 0) return false;
                previous = t;
            }
            return true;
        }
}
