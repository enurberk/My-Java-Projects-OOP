
package javaapplication8;

public class Student {
    
    private int id;
    private String name;
    private int age;
    
    Student(){
        //Constructor with no parameters
        id = 100;
        name = "Jack";
        age = 18;
    }
    Student(int id, String n, int a){
        //Overload Constructor
        this.id = id;
        name = n;
        age = a;
    }
    public void setName(String name){
        //set name to private variable name;
        this.name = name;
    }
    public String getName(){
        //get name from the variable name(memory);
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setID(int id){
        this.id = id;
    }
    public int getID(){
        return id;
    }
    public void DisPlay(){
        System.out.println("id: " + id + " name: " + name + " age: " + age );
    }    
    public String toString(){
        return "id: " + id + " name: " + name + " age: " + age ;
    }
}
