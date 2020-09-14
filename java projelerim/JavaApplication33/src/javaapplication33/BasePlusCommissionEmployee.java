
package javaapplication33;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    double baseSalary;
    public BasePlusCommissionEmployee(String name, int ssn, double grosSales, double commissionRate, double baseSalary){
        super(name,ssn,grosSales,commissionRate);
        this.baseSalary=baseSalary;
    }
    @Override
    double earnings(){
        return super.earnings()+baseSalary;
    }
    public String toString(){
        return "Base Plus " + super.toString() + " Base Salary : " + baseSalary ;
    }
}
