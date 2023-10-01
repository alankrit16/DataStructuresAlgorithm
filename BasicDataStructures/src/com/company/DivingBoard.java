package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class DivingBoard {
    static HashSet<Integer> res = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int l = sc.nextInt();
        divingBoard(k,s,l);
        System.out.println(res.toString());
    }

    private static void divingBoard(int k, int s, int l) {
        HashSet<String> h = new HashSet<>();
        divingBoard(k,s,l,0,h);
    }

    private static void divingBoard(int k, int s, int l, int curr,HashSet<String> visited) {
        if(k==0){
            res.add(curr);
        }else {
            String key = k + " " + curr;
            if(visited.contains(key)){
                return;
            }
            divingBoard(k - 1, s, l, curr + l,visited);
            divingBoard(k - 1, s, l, curr + s,visited);
            visited.add(key);
        }
    }
}
