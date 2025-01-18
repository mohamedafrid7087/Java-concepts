package com.loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            // Prompt for operator
            System.out.print("Enter the operator (+, -, *, /, %) or 'x' to exit: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // Prompt for two numbers
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                // Perform operation
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed!");
                        continue; // Skip the current iteration
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                // Display the result
                System.out.println("Result: " + ans);

            } else if (op == 'x' || op == 'X') {
                // Exit the loop
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            } else {
                // Handle invalid operator
                System.out.println("Invalid operation. Please try again.");
            }
        }

        in.close(); // Close the Scanner
    }
}

/*package com.loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from use till user does not press x
        int ans = 0;
        while(true){
            System.out.print("Enter the operator ");
            char op=in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                // input the two numbers
                System.out.print("Enter the two number ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    ans = num1+ num2;
                }

                if(op == '-'){
                    ans = num1 - num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '/'){
                    if (num2 !=0){
                        ans = num1 / num2;
                    }
                }

                if(op == '%'){
                    ans = num1 % num2;
                }
            }else if (op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println(" invalid operation ");
            }
        }
        System.out.println(ans);
    }
}
*/

