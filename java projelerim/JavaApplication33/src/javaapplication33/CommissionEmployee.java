
package javaapplication33;

public class CommissionEmployee extends Employee{
    double grosSales;
    double commissionRate;  
    public CommissionEmployee(String name, int ssn, double grosSales, double commissionRate){
        super(name,ssn);
        this.grosSales=grosSales;
        this.commissionRate=commissionRate;
    }
    @Override
    double earnings(){
        return commissionRate*grosSales;
    }
    public String toString(){
        return "Commission Employee : " + super.toString() + " Gros Sales : " + grosSales + " Commission Rate : " + commissionRate;
    }
}
