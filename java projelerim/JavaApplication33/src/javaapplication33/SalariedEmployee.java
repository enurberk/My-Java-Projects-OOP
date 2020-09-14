
package javaapplication33;

public class SalariedEmployee extends Employee{
    double weeklySalary;
    public SalariedEmployee(String name, int ssn, double weeklySalary){
        super(name,ssn);
        this.weeklySalary=weeklySalary;
    }
    @Override
    double earnings(){
        return weeklySalary;
    }
    public String toString(){
        return  "Salaried Employee : " + super.toString() + " weekly salary : " + weeklySalary;
    }
}
