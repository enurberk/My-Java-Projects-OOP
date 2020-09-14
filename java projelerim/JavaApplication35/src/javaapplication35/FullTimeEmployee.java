
package javaapplication35;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int wage) {
        super(name, wage);
    }
    
    public double CalculateSalary(){
        return wage;
    }
}
