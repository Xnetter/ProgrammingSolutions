package com.algorithms;

import java.util.HashSet;
import java.util.ArrayList;
import com.algorithms.stringsandarrays.PrintMatrix;
import com.algorithms.stringsandarrays.MergeSort;
public class Main {



    public static void main(String[] args) {
        int[] array = {-1,6,3,-10};
        MergeSort.Sort(array);
        PrintMatrix.printArray(array);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int x = 4;
        arr.add(x);
        while(arr.size() < 3){
            x = 2;
            arr.add(x);
        }
        for(int y : arr){
            System.out.println(y);
        }
    }
}
