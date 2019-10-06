package com.algorithms.dynamicprogramming;

public class ClimbingStairs {
    //You can take stairs one or two at a time. How many possible ways can you take n stairs?
    //Memoization
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

    //Dynamic Programming
    int climbingStairsDP(int n) {
        int[] dp = new int[n];
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}
