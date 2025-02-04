package com.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {7, 8, 9, 55, 66},
                {1, 25, 77},
                {34, 10, 3, 61},
                {1, 2, 3}

        };


        printArray(arr);
        int target = 77;
        int[] ans = searchIn2dArray(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println("finding the maximum value ");
        int max = max(arr);
        System.out.println(max);

        System.out.println("to find the minimum value");
        System.out.println(minValue(arr));
    }

    static void printArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col=0; col < arr[row].length; col++){
                System.out.print(Arrays.toString(arr));
            }
        }
        System.out.println();
    }

    static int[] searchIn2dArray(int[][] arr, int target) {
        // check if the array length is not 0 or return -1


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};  // returnng another array row, col initializing the object because
                    // did not initialized and its not declared.
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        // check if the array length is not 0 or return -1
        int max = arr[0][0];
      //  int max = Integer.MIN_VALUE;

        /*
            static int max(int[][] arr) {
        // check if the array length is not 0 or return -1
        int max = arr[0][0];
      //  int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                     max = arr[row][col];
                }
            }
        }
        return max;
    }

         */ // Enhanced for loop
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] > max) {
                    max = ints[col];
                }
            }
        }
        return max;
    }

    static int minValue(int [][] arr){
        int minimumVal = Integer.MAX_VALUE;

        for (int row=0; row<arr.length; row++){  // for each element in the an array outter row loop.
            for (int col=0; col<arr[row].length; col++){ // for ever col in that particular row.length
                if (arr[row][col]<minimumVal){ // comparing the minimum value iterating each index to find the minimum value comparing with the integer.mx value.
                    minimumVal = arr[row][col];
                }
            }
        }
        return minimumVal;
    }
}


