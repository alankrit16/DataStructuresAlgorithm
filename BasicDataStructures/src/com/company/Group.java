package com.company;
import java.util.*;

class IndexValue{
    int index;
    int value;
    IndexValue(int index, int value){
        this.index = index;
        this.value = value;
    }
}

public class Group {

    public static void main(String[] args) {
        System.out.println(groupThePeople(new int[]{2,1,3,3,3,2}));
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<IndexValue> list = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            list.add(new IndexValue(i,groupSizes[i]));
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.value));
        int x = list.get(0).value;
        List<Integer> curr = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
              curr.add(list.get(i).index);
              x--;
              if(x==0){
                  result.add(curr);
                  curr = new ArrayList<>();
                  if(i+1!=list.size()) {
                      x = list.get(i + 1).value;
                  }
              }
        }

        return result;
    }



}
