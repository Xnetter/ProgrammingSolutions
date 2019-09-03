package com.algorithms;

import java.util.HashSet;
import java.util.ArrayList;
import com.algorithms.stringsandarrays.PrintMatrix;
import com.algorithms.stringsandarrays.Sort;
public class Main {
    public static void main(String[] args) {
        int[] array = {2,-1,2,2,38};
        Sort.QuickSort(array);
        PrintMatrix.printArray(array);
    }
}
