package com.algorithms.stringsandarrays;

public class Sort {
    public static void MergeSort(int[] array) {
        MergeSort(array, new int[array.length], 0, array.length - 1);
    }

    public static void MergeSort(int[] array, int[] temp, int low, int high) {
        if (low >= high)
            return;
        int middle = (high - low) / 2 + low;
        MergeSort(array, temp, low, middle);
        MergeSort(array, temp, middle + 1, high);
        mergeHalves(array, temp, low, high);
    }

    public static void mergeHalves(int[] array, int[] temp, int low, int high) {
        int left = low;
        int middle = (high - low) / 2 + low;
        int right = middle + 1;
        int index = left;
        while (left <= middle && right <= high) {
            if (array[left] < array[right]) {
                temp[index++] = array[left++];
            } else
                temp[index++] = array[right++];
        }
        System.arraycopy(array, left, temp, index, middle - left + 1);
        System.arraycopy(array, right, temp, index, high - right + 1);
        for (int i = low; i <= high; i++) {
            array[i] = temp[i];
        }

    }

    public static void QuickSort(int[] array) {
        QuickSort(array, 0, array.length-1);
    }

    public static void QuickSort(int[] array, int low, int high) {
        if(low >= high)
            return;
        int middle = (high - low)/2 + low;
        int pivot = array[middle];
        int left = low;
        int right = high;
        while(left < right) {
            while(array[left] < pivot){
                left++;
            }
            while(array[right] > pivot){
                right--;
            }
            swap(array, left++, right--);
        }

        QuickSort(array, low, middle); //Sort left half
        QuickSort(array, middle+1, high); //Sort right half
    }

    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j])
                    swap(array, i, j);
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}























