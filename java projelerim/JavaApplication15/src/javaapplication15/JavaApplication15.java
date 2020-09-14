
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
          
    }
    static void Test()
    {
        try
        {
            Scanner input = new Scanner(System.in);   
        
            System.out.println("Enter a value");
            int value1 = input.nextInt();
            
            System.out.println("Please enter another value");
            int value2 = input.nextInt();
            
            System.out.println(value1/value2);
            
            System.out.println("good job!");//value2=0 girildiğinde program durur ve ilerlemez. yani good job yazmaz
       
        }
        catch(Exception exp)
        {
            System.out.println(exp.getMessage());
           //System.out.println("You can not divide by zero!");
        }
        finally
        {
            System.out.println("Do something!");
        }
    }
}
