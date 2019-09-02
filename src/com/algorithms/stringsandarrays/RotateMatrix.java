package com.algorithms.stringsandarrays;

public class RotateMatrix {
    //Given a 2D matrix, rotate it by 90 degrees
    public void rotate(int[][] matrix) {
        for(int i = 0; i <= matrix.length/2; i++){
            for(int j = i; j < matrix.length-i-1; j++){
                int temp = matrix[i][j];
                int boundary = matrix.length - i - 1;
                matrix[i][j] = matrix[boundary + i - j][i];
                matrix[boundary+i-j][i] = matrix[boundary][boundary-j+i];
                matrix[boundary][boundary-j+i] = matrix[j][boundary];
                matrix[j][boundary] = temp;
            }
        }
    }
}
