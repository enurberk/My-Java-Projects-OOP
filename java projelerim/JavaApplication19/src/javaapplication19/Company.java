
package javaapplication19;

public class Company {
    public static String companyName="Nurber Aş.";
    static int number;
    Employee e;
   
    public Company(Employee e){
        this.e=e;
        number++;
    }
    
    public int getNumber(){
        return number;
    }
    
}
