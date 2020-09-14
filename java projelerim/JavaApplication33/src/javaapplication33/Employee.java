
package javaapplication33;

abstract public class Employee {
    String name;
    int ssn;
    public Employee(String name, int ssn){
        this.name=name;
        this.ssn=ssn;
    }
    abstract double earnings();
    public String toString(){
        return "Name : " + name + " snn : " + ssn + " Salary: " + earnings();
    }
}
