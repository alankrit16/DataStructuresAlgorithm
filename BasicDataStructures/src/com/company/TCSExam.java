package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class TCSExam {
    public static void main(String[] args) {

        int[] ar = new int[]{1,2,3,4};
        List<Integer> lx = new ArrayList<>();
        for (int i:
             ar) {
            lx.add(i);
        }

        for (int i = 1; i < 1000000; i++) {
            if(!lx.contains(i)){
                System.out.println(i);
                break;
            }
        }

        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int l = sc.nextInt();
        System.out.println(splitOne(binary,l));
    }

    public static int splitOne(String binary,int L){
        String regex = "(?<=\\G.{"+L+"})";
        String[] array = binary.split(regex);
        int max = Integer.MIN_VALUE;
        for(String s: array){
            int one = 0;
            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i)=='1'){
                    one++;
                }
            }
            max = Math.max(one,max);
        }
        return max;
    }
}
