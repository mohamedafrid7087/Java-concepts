package com.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimAL {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        // Initialization

        for(int i=0; i<3; i++){
            list.add(new ArrayList<>()); // Initializing the arraylist of new object, creating a individual list of object
        }

        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                list.get(i).add(in.nextInt());  // get the list starting from index no=0
            }
        }

        System.out.println(list);

    }
}
