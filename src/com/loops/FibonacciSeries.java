package com.loops;

import java.util.Scanner;

public class FibonacciSeries {
    //1.Generating the Fibonacci Series
    //Difficulty: Easy
    //Topics: Basic Programming, Sequences
    //Description: Write a program to generate the Fibonacci series up to a given number.
    //Example:
    //Input: limit = 10
    //Output: [0, 1, 1, 2, 3, 5, 8]
    //Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].

    public static void generateFibonacci(int limit) {
        int a = 0, b = 1;

        if (limit >= a) {
            System.out.print(a + " ");
        }
        if (limit >= b) {
            System.out.print(b + " ");
        }
        while (true) {
            int next = a + b;
            if (next > limit) {
                break;
            }
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the Fibonacci series: ");
        int limit = scanner.nextInt();
        System.out.println("Fibonacci series up to " + limit + ":");
        generateFibonacci(limit);
    }
}
//

