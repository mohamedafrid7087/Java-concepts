package com.oops;

public class BankAccount {
    private String  accountHolderName;
    private String accountNumber;
    private double balance;
    private double depositeCheck;

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance, double depositeCheck) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.depositeCheck=depositeCheck;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void depositeCheck(double amount){
        if(depositeCheck>0){
            balance+=amount;
            System.out.println("Check deposited" + amount);
        }

    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("John Doe", "123456789", 1000.00, 1000);

        // Test the methods
        System.out.println("total balance");
        account.checkBalance();// Check balance
        account.deposit(500);    // Deposit $500
        account.checkBalance();  // Check balance
        account.withdraw(300);   // Withdraw $300
        account.checkBalance();  // Check balance
       // account.withdraw(1500);  // Attempt to withdraw more than the balance

        account.depositeCheck(1000);
        account.checkBalance();
    }
}

