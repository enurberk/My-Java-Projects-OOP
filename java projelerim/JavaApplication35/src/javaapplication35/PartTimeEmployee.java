
package javaapplication35;

public class PartTimeEmployee extends Employee{
    
    int hours;
    
    public PartTimeEmployee(String name, int wage,int hours) {
        super(name, wage);
        this.hours=hours;
    }
    
    public double CalculateSalary(){
        return super.wage*this.hours;
    }
}
