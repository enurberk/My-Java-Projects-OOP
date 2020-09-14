
package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

    public static void main(String[] args) {
        
        Account ac1 = new Account("Jack", 156.5);
        Account ac2 = new Account("Jane", -7.2);
        
        System.out.println("Name: " + ac1.getName() + "  Balance: " + ac1.getBalance());
        System.out.println("Name: " + ac2.getName() + "  Balance: " + ac2.getBalance());
        
        //create a Scanner to obtain input from the command Window.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a deposit amount for acoount1: ");
        double depositAmount= input.nextDouble();
        System.out.println("\nAdding " + depositAmount + " to account1 balance ->");
        ac1.deposit(depositAmount);
        
        //display to screen
        System.out.println(ac1.getName() + " " + ac1.getBalance());
        System.out.println(ac2.getName() + " " + ac2.getBalance()); 
      
        System.out.println("Enter a deposit amount for acoount2: ");
        depositAmount= input.nextDouble();
        System.out.println("\nAdding " + depositAmount + " to account2 balance");
        ac2.deposit(depositAmount);
        
        //display to screen
        System.out.println(ac1.getName() + " " + ac1.getBalance());
        System.out.println(ac2.getName() + " " + ac2.getBalance());   
        
    }
    
}
