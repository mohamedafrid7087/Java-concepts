package com.SwitchStatementAndNestedCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();

        switch(days){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");

            case 6 -> {
                System.out.println("weekends");
                break;
            }
        }
    }




}
