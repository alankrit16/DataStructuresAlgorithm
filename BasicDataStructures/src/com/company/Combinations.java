package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    static List<List<Integer>> subset = new ArrayList<>();
    public static void main(String args[]){
        combinations(new int[]{-1,0,1,2,-1,-4},new ArrayList<>(),0,3,0);
//        []
        System.out.println(subset.toString());
        System.out.println(subset.size());
    }
    public static void combinations(int[] nums,List<Integer> current,int j,int k,int target){
        if(current.size() == k){
            int sum = 0;
            for (int i = 0; i < current.size(); i++) {
                sum = sum + current.get(i);
            }
            if(sum==target)subset.add(new ArrayList<>(current));
            return;
        }
        for (int i = j; i < nums.length ; i++) {
            current.add(nums[i]);
            combinations(nums,current,i+1,k,target);
            current.remove(current.size()-1);
        }
    }
}
