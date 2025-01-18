package com.arrays;

import java.util.Arrays;

public class arraysProg1 {
    public static void main(String[] args) {
      //  int arr [] = new int[5]; Passing functions in arrays
        // the reference variable pointing towards the object
     //   for(int i=0; i<arr.length; i++){
          //  System.out.println("Print " + i);//
      //  }

        int arr[]  = {2,2,2,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr); // the copy of the reference variable passed in the function
        System.out.println(Arrays.toString(arr));
    }  // As a result the original value has been changed because both the value pointing the same object this known
    // mutable behavious i.e In java the string only are imutable but arrays are immutable.

    static void change(int [] nums){
        nums[0]=1;
    }
}
