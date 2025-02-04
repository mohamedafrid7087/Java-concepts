package com.LinearSearch;

public class FindMinMax {
    public static void main(String[] args) {
        int [] arr ={
                1, 23, 45, 65, 1, 6, 4, 3, 7, 9, 11, 28
        };

        int element = minValue(arr);
        System.out.println(element);

        int maxVal = maxValue(arr);
        System.out.println(maxVal);


    }

     static int minValue(int [] arr){
        int ans = Integer.MAX_VALUE;   // taking the integer. Max value to compare with arr
        for(int element=1; element <arr.length; element++)
            if (arr[element] < ans) {
                ans = arr[element];
            }
        return ans;
     }

     static int maxValue(int [] arr){
        int ans = arr[0];  // keeping the first index 0 to compare with other element in the array
        // int ans = Integer.MIN_VALUE;
        for (int index =1; index < arr.length; index++){
            if (arr[index]> ans){
                ans = arr[index];

            }
        }

        return ans;
     }
}
