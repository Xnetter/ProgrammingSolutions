package com.algorithms.bitmanipulation;

public class MirrorBits {
    public static int mirrorBits(int n){
        int result = 0;
        while(n > 0){
            result *= 2;
            result += n % 2;
            n/=2;
        }
        return result;
    }
}
