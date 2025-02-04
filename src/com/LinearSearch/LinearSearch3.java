package com.LinearSearch;

public class LinearSearch3 {

    // search for an element and return if it is true or false

    public static void main(String[] args) {

        int [] arr ={1, 23, 45, 65, -1, -6, -4, -3, 7, 9, -11, 28};
        int target = 44;
        boolean ans = linearSearch3(arr, target);
        System.out.println(ans);


    }

    static boolean linearSearch3 (int [] arr, int target){
        if(arr.length==0){
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }

        }

        return false;
    }
}
