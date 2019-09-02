package com.algorithms.stringsandarrays;

public class Search {
    public static int BinarySearch(int[] array, int target){
        //Array must be sorted
        int low = 0;
        int high = array.length;
        while (low < high){
            int index = (high-low)/2 + low;
            if(array[index] == target)
                return index;
            else if(array[index] < target)
                low = index+1;
            else
                high = index-1;
        }
        return -1;
    }
}
