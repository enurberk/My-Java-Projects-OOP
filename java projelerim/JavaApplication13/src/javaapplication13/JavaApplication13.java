
package javaapplication13;

import java.util.Scanner;

public class JavaApplication13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();
        
        System.out.println("Initial name is: " + myAccount.getName());
        
        System.out.println("Please enter the name: ");
        
        String theName =input.nextLine();
        
        myAccount.setName(theName);
        
        System.out.println("The name is: " + myAccount.getName());
        
    }
    
}
