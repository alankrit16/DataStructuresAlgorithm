package com.company;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] x = new int[]{0,1,0,3,12};
        moveZeros(x);
        for (int i: x) {
            System.out.println(i+ " ");
        }
    }

    private static void moveZeros(int[] nums) {
        int index = 0;
        // int i = 0;
        for(int i=0;i<nums.length;i++){
            int j=i;
            if(nums[index]==0){
                while(nums[j]==0){
                    j++;
                }
                if(j!=nums.length){
                    nums[index] = nums[j];
                    nums[j] = 0;
                }
                i=j;
            }
            index++;
        }
    }
}
