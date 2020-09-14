
package javaapplication17;

public class Employee {
    
    public static String companyName = "ENK";
    
    private int id;
    private String name;
    
    //final static int number;  number++ yapmaya izin vermiyor
    static int number;
    public int _number;
    
    public Employee(int id, String name){
        this.id=id;
        this.name=name;
        number++;
        _number++;
    }
    public void printInfo(){
        System.out.println(this.id + " " + this.name + " " + companyName );//Employee.companyName
    }
}
