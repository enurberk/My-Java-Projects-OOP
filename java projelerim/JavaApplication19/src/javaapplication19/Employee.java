
package javaapplication19;

public class Employee {
    private String name;
    private int id;
    //static int number;
    
    public Employee(String name, int id){
        this.name= name;
        this.id=id;
        //number++;
    }
    public String toString(){
        return "id: " + this.id + " name: " + this.name + " company: " + Company.companyName;
    }
    
}
