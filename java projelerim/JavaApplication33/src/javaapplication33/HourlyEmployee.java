
package javaapplication33;

public class HourlyEmployee extends Employee{
    double wage;
    int hours;
    public HourlyEmployee(String name, int ssn, double wage,int hours){
        super(name, ssn);
        this.wage=wage;
        this.hours=hours;
    }
    @Override
    double earnings(){
        if(hours<=40)
            return wage*hours;
        else
            return 40*wage+(hours-40)*wage*1.5;
    }
    public String toString(){
        return "Hourly Employee : " + super.toString() + " Hourly Wage : " + wage + " Hours Worked :  " + hours ;
    }
}
