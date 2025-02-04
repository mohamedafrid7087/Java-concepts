package com.LinearSearch;

import java.util.concurrent.LinkedBlockingDeque;

public class LinearSearch1 {

    public static void main(String[] args) {
        int [] number = {1, 23, 45, 65, -1, -6, -4, -3, 7, 9, -11, 28};
        int target = -3;
        int ans = linearSearch(number, target);
        System.out.println(ans);


    }

    // find the element in the array : return the index if the element item found
    // oherwise return -1

    static int linearSearch(int [] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0; index<arr.length; index++){
            // check for the element at every index if it is = to the target
           int element = arr[index];
           if (element == target){
               return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found.
        return -1;
    }
}
