
package javaapplication35;

public abstract class Employee implements Salary{
        String name;
        int wage;
        public Employee(String name,int wage){
            this.name=name;
            this.wage=wage;
        }
        public abstract double CalculateSalary();
}
