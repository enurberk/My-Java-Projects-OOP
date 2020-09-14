
package javaapplication9;

public class Student {

    private int id;
    private String name;
    private int age;
    
    public Student(){
        id = 10;
        name = "Jack";
        age = 20;
    }
    public Student(int id, String name , int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    
    public void DisPlay(){
        System.out.println("id: " + id + "  " + "name: " + name + "  " + "age: " + age  );
    }
    

    
}
