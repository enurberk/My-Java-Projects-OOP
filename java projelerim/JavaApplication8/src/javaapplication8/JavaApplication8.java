
package javaapplication8;

public class JavaApplication8 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.DisPlay();
        
        Student s2 = new Student(200, "Jane", 22);
        s2.DisPlay();
        
        Student s3 = new Student();
        s3.setName("Venom");
        System.out.println(s3.getName());
        
        Student s4 = new Student();
        s4.setAge(24);
        System.out.println(s4.getAge());
        
        Student s5 = new Student();
        s5.setAge(25);
        s5.getAge();
        
        s5.setName("Mehmet");
        s5.getName();
        
        s5.setID(300);
        s5.getID();
        
        s5.toString();
        
        System.out.println(s5);
    } 
}
