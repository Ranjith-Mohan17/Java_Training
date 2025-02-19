package com.celcom.Saturday_Assignment_8th_Feb_2025;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private String accNumber;
    private double balance;

    // Constructor to initialize account details
    Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    // Getter for Account Number
    public String getAccNumber() {
        return accNumber;
    }

    // Getter for Balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Successfully! New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount! Deposit must be greater than zero.");
        }
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful! Remaining Balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount!");
            return false;
        }
    }
}

public class Bank {
    private static final ArrayList<Account> collection = new ArrayList<>();  // List of all accounts

    // Method to add a new account
    private static void addAccount(Account acc) {
        if (getAccount(acc.getAccNumber()) == null) {  // Check if account already exists
            collection.add(acc);
            System.out.println("Account Added Successfully!");
        } else {
            System.out.println("Account with this number already exists! Try a different number.");
        }
    }

    // Method to remove an account using account number
    private static void removeAccount(String accNumber) {
        Account acc = getAccount(accNumber);
        if (acc != null) {
            collection.remove(acc);
            System.out.println("Account Removed Successfully!");
        } else {
            System.out.println("Account Not Found! Please check the account number.");
        }
    }

    // Method to display all accounts
    private static void displayAccounts() {
        if (collection.isEmpty()) {  
            System.out.println("No More Accounts in the Bank!");
            return;
        }
        System.out.println("\nList of All Accounts:");
        for (Account acc : collection) {
            System.out.println("Account Number: " + acc.getAccNumber() + " | Balance: " + acc.getBalance());
        }
    }

    // Method to search for an account by account number
    private static Account getAccount(String accNumber) {
        for (Account acc : collection) {
            if (acc.getAccNumber().equals(accNumber)) {
                return acc;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false; 

        while (!exit) {
            System.out.println("\n===== BANKING SYSTEM MENU =====");
            System.out.println("1 -> Add Account");
            System.out.println("2 -> Remove Account");
            System.out.println("3 -> Display All Accounts");
            System.out.println("4 -> Deposit Money");
            System.out.println("5 -> Withdraw Money");
            System.out.println("6 -> Check Account Balance");
            System.out.println("7 -> Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            String accNo;
            double amount;

            switch (choice) {
                case 1:  // Add new account
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    System.out.print("Enter Initial Deposit Amount: ");
                    amount = sc.nextDouble();
                    addAccount(new Account(accNo, amount));
                    break;

                case 2:  // Remove existing account
                    System.out.print("Enter Account Number to Remove: ");
                    accNo = sc.next();
                    removeAccount(accNo);
                    break;

                case 3:  // Display all accounts
                    displayAccounts();
                    break;

                case 4:  // Deposit money into an account
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    Account depositAcc = getAccount(accNo);
                    if (depositAcc != null) {
                        System.out.print("Enter Amount to Deposit: ");
                        amount = sc.nextDouble();
                        depositAcc.deposit(amount);
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 5:  // Withdraw money from an account
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    Account withdrawAcc = getAccount(accNo);
                    if (withdrawAcc != null) {
                        System.out.print("Enter Amount to Withdraw: ");
                        amount = sc.nextDouble();
                        withdrawAcc.withdraw(amount);
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 6:  // Check account balance
                    System.out.print("Enter Account Number to Check Balance: ");
                    accNo = sc.next();
                    Account balanceAcc = getAccount(accNo);
                    if (balanceAcc != null) {
                        System.out.println("Current Balance for Account " + accNo + " is: " + balanceAcc.getBalance());
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 7:  // Exit the application
                    System.out.println("Exiting the Banking System. Have a great day!");
                    exit = true;
                    break;

                default:  // Handle invalid choices
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }
        sc.close(); 
    }
}
