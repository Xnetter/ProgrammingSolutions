package com.algorithms.stringsandarrays;

public class TailRecursion {
    public static int power(int n, int p){
        return power(1, n, p);
    }

    public static int power(int a, int b, int p){
        if(p == 0){
            return a;
        }
        return power(a*b, b, p-1);
    }

}
