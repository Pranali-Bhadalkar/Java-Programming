//Program Based on Concept of Class and Object
//(Bank Account Management System)

import java.util.Scanner;

class BankAccount 
{
    public static void main(String argu[]) 
{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();

        System.out.println("Enter Account Holder Name:");
        String name = sc.next();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter amount to Deposit:");
        double deposit = sc.nextDouble();
        balance = balance + deposit;

        System.out.println("Enter amount to Withdraw:");
        double withdraw = sc.nextDouble();
        if (withdraw <= balance) 
{
            balance = balance - withdraw;
        } 
else 
{
            System.out.println("Insufficient Balance!");
        }

        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Final Balance: " + balance);
    }
}



