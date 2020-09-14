
package javaapplication45;

public class Employee implements Comparable<Employee>{
    
    String name;
    int wage;
    
    public Employee(String name,int wage){
        this.name=name;
        this.wage=wage;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.wage>o.wage) return 1;
        else if(this.wage==o.wage) return 0;
        else return -1;
    }
    
    public String toString(){
        return name;
    }
}
