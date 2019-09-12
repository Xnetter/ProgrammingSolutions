package com.algorithms.bitmanipulation;
//A solution which returns the number of 1 bits in a number n.
public class NumberOf1s {
    public static int numberOf1Bits(int n) {
        int res = 0;
        while (n != 0) {
            int x = 0;
            while(Math.pow(2, x) <= n){
                x++;
            }
            n -= Math.pow(2, x-1);
            res++;
        }
        return res;
    }
}
