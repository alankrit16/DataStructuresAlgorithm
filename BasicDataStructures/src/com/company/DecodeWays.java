package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class DecodeWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(numDecodings(s));
    }
    public static int numDecodings(String s) {
        HashMap<String,Integer> visited = new HashMap();
        return solve(s,0,visited);
    }

    private static int solve(String s, int i, HashMap<String, Integer> visited) {
        if(visited.containsKey(s+i)){
            return visited.get(s+i);
        }
        if(i>=s.length()){
            return 1;
        }
        if(s.charAt(i)=='0') {
            return 0;
        }
        int ways = solve(s,i+1, visited);
        if(i+2<= s.length() && Integer.parseInt(s.substring(i,i+2))<=26) {
            ways = ways + solve(s, i + 2, visited);
        }
        visited.put(s+i,ways);
        return ways;
    }

}
