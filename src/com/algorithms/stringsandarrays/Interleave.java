package com.algorithms.stringsandarrays;
//A function to interleave two strings. Used to find number of inter-leavings for concurrent programs.
public class Interleave {
    public static void interleave(String a, String b){
        interleave(a.substring(0,1), a.substring(1), b);
        interleave(b.substring(0,1), a, b.substring(1));
    }


    private static void interleave(String prefix, String a, String b){
        if(b.isEmpty()){
            System.out.println(prefix + a);
            return;
        }
        else if(a.isEmpty()){
            System.out.println(prefix + b);
            return;
        }
        interleave(prefix + a.substring(0,1), a.substring(1), b);
        interleave(prefix + b.substring(0,1), a, b.substring(1));
    }
}
