
package javaapplication49;

public class Student implements Comparable<Student>{
    int id;
    String name;
    double midterm;
    double finalex;

    public Student(int id, String name, double midterm, double finalex) {
        this.id = id;
        this.name = name;
        this.midterm = midterm;
        this.finalex = finalex;
    }
    
    double getScore(){
        return midterm*0.4+finalex*0.6;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", name=" + name + ", midterm=" + midterm + ", final=" + finalex + ", score=" + getScore() + '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
        //return this.id-o.id;
    }
    
}
