package com.algorithms.bitmanipulation;
//A solution which inserts a binary integer k into n, starting at bit a
//and ending at bit b.
public class InsertBits {
    int insertBits(int n, int a, int b, int k) {
        //a -> b
        int mask = ~0; // A sequence of ones.
        mask <<= (b+1); // Move ones left to b + 1
        int mask2 = ((1 << a) -1); //A sequence of 1s which end at a
        mask |= mask2; //Combine the masks
        n &= mask;// Clear the destination bits.
        k <<= (a);//Move K over a bits.
        n |= k;// Insert K into n.
        return n;
    }
}
