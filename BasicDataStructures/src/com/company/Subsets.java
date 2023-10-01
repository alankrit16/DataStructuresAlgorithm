package com.company;

import java.util.*;

public class Subsets {
    static List<List<String>> subsets = new ArrayList<>();
    public static void main(String args[]){
        int[][] grid = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        heapify();
        String str = "123";
        int[] a = new int[]{1,7,3,6,5,6};
        pivotIndex(a);
        generateSubsets(str,new ArrayList<>(),0);
        System.out.println(subsets.toString());
        PriorityQueue<Integer> x = new PriorityQueue<>();
        x.add(5);
        x.add(6);
        x.add(3);
        x.poll();
        x.add(7);
        System.out.println(x.toString());
    }
    private static void heapify(){
        int[] nums = new int[]{1,2};
        int k = 2;
        HashMap<Integer,Integer> count = new HashMap<>();
        TreeMap<Integer,Integer> reverseCount = new TreeMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(!count.containsKey(nums[i])){
                count.put(nums[i],1);
            }else{
                count.put(nums[i],count.get(nums[i])+1);
            }
        }
        for (Integer i: count.keySet()) {
            reverseCount.put(count.get(i),i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer i: reverseCount.descendingKeySet()) {
            ans.add(reverseCount.get(i));
        }
        int[] list = new int[k];
        for (int i = 0; i <ans.size()||i<k ; i++) {
            list[i] = ans.get(i);
        }
        for (int i:
             list) {
            System.out.println(i);
        }
    }
    private static void generateSubsets(String str, List<String> current, int i) {
        subsets.add(new ArrayList<>(current));
        for (int j = i; j < str.length(); j++) {
            current.add(str.charAt(j)+"");
            generateSubsets(str,current,j+1);
            current.remove(current.size()-1);
        }
    }

    public static int pivotIndex(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 0;
        right[nums.length-1] = 0;
        for(int i=1;i<left.length;i++){
            left[i] =  left[i-1]+nums[i-1];
        }
        for(int i=right.length-2;i>= 0;i--){
            right[i] = right[i+1]+nums[i+1];
        }
        for(int i=0;i<left.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}
