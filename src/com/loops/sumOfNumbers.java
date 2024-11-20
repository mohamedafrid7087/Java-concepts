package com.loops;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ask user to enter any number");
        int count =sc.nextInt();
        int initialize =0;
        for(int i=1; i<count; i++){ // starting from 1
            initialize+=i;
        }

        System.out.println("The sum of numbers from 1 to " + count + " is " + initialize + ".");

        sc.close();
    }
}
