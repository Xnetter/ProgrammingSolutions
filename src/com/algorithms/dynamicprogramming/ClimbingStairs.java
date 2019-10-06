package com.algorithms.dynamicprogramming;

public class ClimbingStairs {
    //You can take stairs one or two at a time. How many possible ways can you take n stairs?
    int climbingStairs(int n) {
        return climbingStairs(n, new int[n]);
    }

    private int climbingStairs(int n, int[] mem){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(mem[n-1] != 0){
            return mem[n-1];
        }
        mem[n-1] = climbingStairs(n-1, mem) + climbingStairs(n-2, mem);
        return mem[n-1];
    }

}
