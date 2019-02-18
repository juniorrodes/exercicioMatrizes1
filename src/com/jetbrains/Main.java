package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numbers;
        int lines = (int) (3 + Math.random() * 7);
        System.out.print(String.format("Number of lines: %d\n", lines));
        int rows = (int) (3 + Math.random() * 7);
        System.out.print(String.format("Number of columns: %d\n", rows));
        NumbersAround numbersAround = new NumbersAround(lines, rows);
        for (int i = 0; i < lines; i++){
            for (int j = 0; j < rows; j++){
                numbers = (int) (1 + Math.random() * 15);
                numbersAround.setElement(i, j, numbers);
            }
        }
        System.out.println(numbersAround);
        System.out.print("One number of the matrix: ");
        int expectedNumber = scanner.nextInt();
        String resultString = numbersAround.getNumbersAround(expectedNumber);
        System.out.println(resultString);
        scanner.close();

    }
}
