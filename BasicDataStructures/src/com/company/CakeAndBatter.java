package com.company;

public class CakeAndBatter {

    public static void main(String[] args) {
        int ans = fastestCake(new int[]{11,14,8,12,1,13},new int[]{19,4,12,12,1,11});
        System.out.println(ans);
    }

    private static int fastestCake(int[] A, int[] B){
        int time = 0;

        sort(A, B);
        int[] batInd = new int[B.length+1];
        batInd[B.length] = 0;
        for (int i = B.length-1; i >-1; i--) {
            batInd[i] = batInd[i+1] + A[i];
            if(time<batInd[i]+B[i]){
                time = batInd[i]+B[i];
            }
        }

        return time;
    }

    private static void sort(int[] A, int[] B){
        for (int i = 0; i < B.length ; i++) {
            for (int j = i+1; j < B.length; j++) {
                if(B[i]>B[j]){
                    int temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;

                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
}
