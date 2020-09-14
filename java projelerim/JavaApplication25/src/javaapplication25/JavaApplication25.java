
package javaapplication25;

import mynewpackage.Rectange;

import java.util.Scanner;

public class JavaApplication25 {

    public static void main(String[] args) {
        Rectange r1 = new Rectange();
        Rectange r2 = new Rectange(25, 30);
        Rectange r3 = new Rectange(10, 10, 25, 30);
        
        Rectange[] rects = new Rectange[]{r1, r2, r3};
        
        for (int i = 0; i < rects.length; i++) {
            System.out.println(rects[i].getArea());
        }
        
        try{
        Account a1 = new Account(100, 1500);
        Account a2 = new Account(200, 2000);
        
        System.out.println("Account Number: " + a1.getAccountNumber() + "  balance: " + a1.getBalance() );
        System.out.println("Account Number: " + a2.getAccountNumber() + "  balance: " + a2.getBalance() );
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nEnter a deposit for account1: ");
        double amount = input.nextDouble();
        System.out.println("Adding " + amount + " to account1 balance");
        a1.deposit(amount);
        System.out.println("Account number: " + a1.getAccountNumber() + " balance: " + a1.getBalance());
        
        System.out.println("\nEnter a deposit for account2: ");
        amount = input.nextDouble();
        System.out.println("Adding " + amount + " to account2 balance");
        a2.deposit(amount);
        System.out.println("Account number: " + a2.getAccountNumber() + " balance: " + a2.getBalance());
        
        Account a3 = new Account(300);
        System.out.println("\nset balance for account3: ");
        amount = input.nextDouble();
        a3.setBalance(amount);
        System.out.println("Account number: " + a3.getAccountNumber() + " balance: " + a3.getBalance() + "\n");
       
//        a1.toString();
//        a2.toString();
//        a3.toString();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);    
        a1.chooseWhichAccountForWithdraw();
//        do{
//        System.out.println("\nPlease enter the amount of money you want to withdraw for account3:");
//        amount = input.nextDouble();
//        a3.withdraw(amount);
//        System.out.println("Account number: " + a3.getAccountNumber() + " balance: " + a3.getBalance());
//        }
//        while(true);
        }
        catch(Exception e){
            System.out.println(e.getMessage());    
        }
    }
} 