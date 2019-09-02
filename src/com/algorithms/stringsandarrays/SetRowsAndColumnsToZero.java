package com.algorithms.stringsandarrays;

import java.util.HashSet;

public class SetRowsAndColumnsToZero {
    //Given a 2D matrix, if an element is zero, set its rows and columns to zero.
    public static void setToZero(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<Integer>();
        HashSet<Integer> cols = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int row : rows){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[row][j] = 0;
            }
        }
        for(int col : cols){
            for(int j = 0; j < matrix.length; j++){
                matrix[j][col] = 0;
            }
        }
    }
}
