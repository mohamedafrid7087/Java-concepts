package com.LinearSearch;

public class SearchInParticularRange {

    // Search for 3 in the range of index 1 till 4 [1, 4]

    public static void main(String[] args) {

        int [] arr = {1, 23, 45, 3, -1, -6, -4, -3, 7, 9, -11, 28};
        int target = 3;
        int ans = linearSearch(arr, target,1, 4);
        System.out.println(ans);
    }

    public static int linearSearch(int [] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }

        for(int index=start; index<=end; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
