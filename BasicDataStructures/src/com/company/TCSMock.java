package com.company;

import java.util.Arrays;

public class TCSMock {
    public static void main(String args[]){
        int max_profit = coinsGame(new int[]{2,202,2,3,200,4,5});
        String[] x = new String[]{"a","banana","app","appl","ap","apply","apple"};
        Arrays.sort(x);
        for (String string:x) {
            System.out.print(string+"\t");
        }
        System.out.println();   
        System.out.println(max_profit);
    }

    private static int coinsGame(int[] nums) {
        int maxProfit = Integer.MIN_VALUE;
        int profit = nums[0];
        for (int i = 0; i < nums.length-1 ; i++) {
            if(nums[i]<=nums[i+1]){
                profit = profit + nums[i+1];
            }else{
                profit = nums[i+1];
            }
            maxProfit = Math.max(profit,maxProfit);
        }

        return maxProfit;
    }
}
