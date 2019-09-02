package com.algorithms.stringsandarrays;

import java.util.ArrayList;

public class PrintMatrix {
    //A utility class for matrix print functions.
    public static void printMatrix(int[][] matrix){
        for (int[] array : matrix) {
            for (int x : array) {
                System.out.print(x + ", ");
            }
            System.out.println();
        }
    }
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix){
        for (ArrayList<Integer> array : matrix) {
            for (int x : array) {
                System.out.print(x + ", ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array){
        for(int x : array){
            System.out.print(x + ", ");
        }
    }

}
