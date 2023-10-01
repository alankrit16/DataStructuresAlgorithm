package com.company;

import java.util.Scanner;

public class TCSExam2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findWays(n));
    }


    static long binomialCoeff(int n, int k)
    {
        long res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }

    static long catalan(int n)
    {
        // Calculate value of 2nCn
        long c = binomialCoeff(2 * n, n);

        // return 2nCn/(n+1)
        return c / (n + 1);
    }


    static long findWays(int n)
    {
        if ((n & 1) != 0)
            return 0;

        return catalan(n / 2);
    }

}

