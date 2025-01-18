package com.arrays;

public class Max {

    public static void main(String[] args) {
        int []arr={1, 2, 55, 44, 88, 65};
        System.out.println(max(arr));

    }
    // imagine that array is not empty
    static int max(int [] arr){
        int maxVal= arr[0];
        for(int i=0; i<arr.length; i++){  // length of the array
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int [] arr, int start, int end){
        int maxVal= arr[start];
        for(int i=start; i<=end ; i++){  // length of the array
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
