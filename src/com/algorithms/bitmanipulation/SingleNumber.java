package com.algorithms.bitmanipulation;
//In an array which has only one number appearing once,
//and every other number appearing twice, this solution
//returns the number that appears only once.
public class SingleNumber {
    int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num; // XOR records only the bits which appear an odd number of times.
        }
        return res;
    }
}
