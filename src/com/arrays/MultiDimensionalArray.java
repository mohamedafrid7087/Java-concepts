package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         /* int [][] arr = {
                  {1,2,3,4,5},
                  {4,88,55},
                  {87,52,45,77}
          }; */

        // input
        int [][]arr =new int[3][3];
        System.out.println(arr.length);
        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){ // every array of the row we are taking that array
                arr[row][col]= sc.nextInt();
            }
        }

        //output

        for(int row=0; row<arr.length; row++){  // just printing the entire for loop
            for (int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // enhancd for loop

        for (int row =0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        // every element itself is an array

        for (int [] a : arr) {
            System.out.println(Arrays.toString(a));
        }


    }
}
