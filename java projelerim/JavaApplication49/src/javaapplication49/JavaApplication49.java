
package javaapplication49;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaApplication49 {

    public static void main(String[] args) {
        
        List<String> nameList = new LinkedList<>(); 
        nameList.add("elif");
        nameList.add("mehmet");        
        nameList.add("fatih");     
        nameList.add("nurber");        
        nameList.add("ali");
        
        System.out.println(nameList);
        Collections.sort(nameList);
        System.out.println(nameList);        

        List<Student> myStudents = new LinkedList<>();
        
        Student s1 = new Student(100,"ali",65,80);
        Student s2 = new Student(300,"nurber",55,89);
        Student s3 = new Student(200,"elif",88,100);
        
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        
        System.out.println("First-> " + myStudents);
        Collections.sort(myStudents);
        System.out.println("Name-> " + myStudents);
        
        IDComparator idcomp = new IDComparator();
        ScoreComparator scorecomp = new ScoreComparator();
        FinalScoreComparator finalcomp = new FinalScoreComparator();
        
        myStudents.sort(idcomp);
        System.out.println("ID-> " + myStudents);
        myStudents.sort(scorecomp);
        System.out.println("Score-> " + myStudents);
        myStudents.sort(finalcomp);
        System.out.println("Final-> " + myStudents);
        Collections.reverse(myStudents);
        System.out.println("Final-> " + myStudents);
    }    
}
