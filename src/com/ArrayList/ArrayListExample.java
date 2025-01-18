package com.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    // Implementation of Array List

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

      //  list.add(77);
       // list.add(88);
        //list.add(12);
        //list.add(34);
       // list.add(98);
        //list.add(62);

       // System.out.println(list);
// input
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        // get the item in each index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));// pass the index here list[index] will not work here
        }
    }
}
