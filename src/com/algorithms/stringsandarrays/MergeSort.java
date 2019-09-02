package com.algorithms.stringsandarrays;

public class MergeSort {
    public static void Sort(int[] array){
        Sort(array, new int[array.length], 0, array.length-1);
    }

    public static void Sort(int[] array, int[] temp, int low, int high){
        if(low >= high)
            return;
        int middle = (high - low)/2 + low;
        Sort(array, temp, low, middle);
        Sort(array, temp, middle+1, high);
        mergeHalves(array, temp, low, high);
    }

    public static void mergeHalves(int[] array, int[] temp, int low, int high){
        int left = low;
        int middle = (high - low)/2 + low;
        int right = middle+1;
        int index = left;
        while(left <= middle && right <= high){
            if(array[left] < array[right]){
                temp[index++] = array[left++];
            }
            else
                temp[index++] = array[right++];
        }
        System.arraycopy(array, left, temp, index, middle-left+1);
        System.arraycopy(array, right, temp, index, high-right+1);
        for(int i = low; i <= high; i++){
            array[i] = temp[i];
        }

    }
}
