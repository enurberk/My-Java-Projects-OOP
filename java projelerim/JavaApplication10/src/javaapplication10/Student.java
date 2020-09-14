
package javaapplication10;

import java.util.Scanner;

public class Student {
    
   private int id;
   
   public void setID(int id){
       if(id>100)
        this.id= id;
    }
   public int getID(){
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter a password: ");
       int kullaniciGiris = input.nextInt();
       if(kullaniciGiris==12345)
           return id;
       else 
           return -1;
   }
   
    
}
