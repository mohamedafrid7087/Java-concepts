package com.LinearSearch;

public class LinearSearch2 {

    public static void main(String[] args) {
        int [] arr ={1, 23, 45, 65, -1, -6, -4, -3, 7, 9, -11, 28};
        int target = 44;
        int ans = linearSearch(arr, target);
        System.out.println(ans);

    }

    static int linearSearch(int [] arr, int target){

        if(arr.length==0){
            return -1;
        }

        for(int index=0; index <arr.length; index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }

        // if the element is not found then return -1
        return -1;
    }
}
