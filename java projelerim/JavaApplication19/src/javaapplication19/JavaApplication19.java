
package javaapplication19;

public class JavaApplication19 {

    public static void main(String[] args) {
        
        Employee e1 = new Employee("Jack",100);
        Company c1 = new Company(e1);
        
        Employee e2 = new Employee("Jane",200);
        Company c2 = new Company(e2);
        
        System.out.println(e1.toString());
        System.out.println(c1.getNumber());
        
        System.out.println(e2.toString());
        System.out.println(c2.getNumber());
        
    }
    
}
