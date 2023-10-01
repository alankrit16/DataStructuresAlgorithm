package com.company;

import java.util.Arrays;
import java.util.Stack;
public class NGR {
    public static void main(String[] args) {
        int[] nums = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] bf = nearestGreaterBF(nums);
        for (int i:bf
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
        int[] op = nearestGreater(nums);
        for (int i:
             op) {
            System.out.print(i+" ");
        }
        System.out.println();
        int[] index = nearestGreaterIndex(nums);
        for (int i:
                index) {
            System.out.print(i+" ");
        }

    }

    private static int[] nearestGreaterIndex(int[] nums) {
        int[] ngr = new int[nums.length];
        Stack<Value> stack = new Stack<>();
        ngr[ngr.length-1] = 0;
        stack.push(new Value(nums[nums.length-1], nums.length-1));
        for (int i = ngr.length-2; i >=0 ; i--) {
            while(!stack.isEmpty() && stack.peek().value<nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()) {
                ngr[i] = 0;
            }else{
                ngr[i] = stack.peek().index - i;
            }
            stack.push(new Value(nums[i],i));
        }
        return ngr;
    }

    private static int[] nearestGreater(int[] nums) {
        int[] ngr = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        ngr[ngr.length-1] = -1;
        stack.push(nums[nums.length-1]);
        for (int i = ngr.length-2; i >=0 ; i--) {
            while(!stack.isEmpty() && stack.peek()<nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()) {
                ngr[i] = -1;
            }else{
                ngr[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return ngr;
    }

    private static int[] nearestGreaterBF(int[] nums) {
        int[] ngr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                ngr[i] = -1;
                if(nums[i]<nums[j]){
                    ngr[i] = nums[j];
                    break;
                }
            }
        }
        return ngr;
    }

}

class Value{
    public int value;
    public int index;

    Value(int value,int index){
        this.value = value;
        this.index = index;
    }
}