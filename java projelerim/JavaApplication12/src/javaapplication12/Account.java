

package javaapplication12;


public class Account {
    private String name;
    private double balance;
  
    private int counter;
    
    public Account(String name, double balance){
        this.name=name;
        this.balance=balance;
    }
    public void withDraw(double amount){
        if(counter<3 && amount>0){
            balance-=amount;
            counter++;           
        }
        else
            System.out.println("Sorry!Today you are reach the withdraw limit or you are cheating");
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String n){
        name= n;
    }
    public String getName(){
        return name;
    }
}
