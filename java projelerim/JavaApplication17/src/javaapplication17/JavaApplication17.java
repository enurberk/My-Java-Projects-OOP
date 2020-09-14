
package javaapplication17;

public class JavaApplication17 {


    public static void main(String[] args) {
            
        Employee e1 = new Employee(100, "Jack");
        e1.companyName = "HY";
        
        Employee e2 = new Employee(200, "Jane");
        e2.companyName = "MZK";

        e1.printInfo();//en son girilen company name i kabul ediyor.
        e2.printInfo();
       
        System.out.println(Employee.number);//Employee.number
        System.out.println(e1._number);
        System.out.println(e2._number);
    }
    
}
