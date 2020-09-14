
package javaapplication25;

import java.util.Scanner;

public class Account {

    private int accountNumber;
    private double balance=0.0;
    static double amount;
    Scanner scanner = new Scanner(System.in);
    
    Account(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        if(balance>0.0)
        this.balance=balance;
    }
    Account(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if(balance>0.0)
          this.balance=balance;
        else
            throw new IllegalArgumentException("Your balance amount must be bigger than 0!");
    }
    public void deposit(double amount){
        if(amount>0.0)
           balance+=amount;
        else
            throw new IllegalArgumentException("Your deposit amount must be bigger than 0!");
    }
    public void withdraw(double amount){
        if(amount>0.0 && amount<=balance){
            balance-=amount;
        }
        else
            throw new IllegalArgumentException("ERROR!");    
    }
    
    public void chooseWhichAccountForWithdraw(){
        System.out.println("Please choose the account for withdraw: \n[1-account1] \n[2-account2] \n[3-account3]");
        int userSelection = scanner.nextInt();
        System.out.println("Please enter the amount of money for withdraw!");
        amount=scanner.nextDouble();
        switch(userSelection)
        {
            case 1: withdraw(amount);
                    System.out.println("Account Number: " + getAccountNumber() + "  balance: " + getBalance() );
                    break;
                    
            case 2: withdraw(amount);
                    System.out.println("Account Number: " + getAccountNumber() + "  balance: " + getBalance() );
                    break;
                    
            case 3: withdraw(amount);
                    System.out.println("Account Number: " + getAccountNumber() + "  balance: " + getBalance() );
                    break;
            default: 
                System.out.println("You choosed wrong!");
        }
    }
    public String toString(){
        return "Account Number: " + accountNumber + " Balance: " + balance ;
    }
    
}