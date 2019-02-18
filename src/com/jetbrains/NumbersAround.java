package com.jetbrains;

import java.util.Arrays;

public class NumbersAround {

    private int [][] matrix;

    public NumbersAround(int lines, int rows) {
        matrix = new int[lines][rows];
    }

    public void setElement(int line, int row, int number){
        matrix[line][row] = number;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder("The matrix is: \n");
        for (int[] line: matrix) {
            for (int num : line) {
                ret.append(String.format("%02d ", num));
            }
            ret.append("\n");
        }
        return ret.toString();
    }

    public String getNumbersAround(int expectedNumber) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == expectedNumber){
                    ret.append("The numbers around are: ");
                    ret.append(getLeftValue(i, j));
                    ret.append(getRightValue(i, j));
                    ret.append(getUpValue(i, j));
                    ret.append(getDownValue(i, j));
                    ret.append("\n");
                }
            }
        }
        return ret.toString();
    }

    private String getDownValue(int line, int row) {
        String ret = " | Down: ";
        if (line < (matrix.length - 1)){
            ret += matrix[line + 1][row];
        }
        return ret;
    }

    private String getUpValue(int line, int row) {
        String ret = " | Up: ";
        if (line > 0){
            ret += matrix[line - 1][row];
        }
        return ret;
    }

    private String getRightValue(int line , int row) {
        String ret = " | Right: ";
        if (row < (matrix[line].length - 1)){
            ret += matrix[line][row + 1];
        }
        return ret;
    }

    private String getLeftValue(int line, int row) {
        String ret = "Left: ";
        if (row > 0) {
            ret += matrix[line][row - 1];
        }
        return ret;
    }
}
