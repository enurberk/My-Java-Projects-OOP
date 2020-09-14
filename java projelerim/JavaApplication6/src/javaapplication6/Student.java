
package javaapplication6;

import java.util.Scanner;

public class Student {

    //attributes
    String name;
    int id;
    float mid;
    float fin;
    float score;
    Scanner scanner = new Scanner(System.in);    
    //behaviours
    void EnterNameId(){
        System.out.println("Enter name of student: ");
        name=scanner.nextLine();
        System.out.println("Enter id of student: ");
        id= scanner.nextInt();
    } 
    void EnterMidFin(){
        System.out.println("Enter mid of student: ");
        mid=scanner.nextFloat();
        System.out.println("Enter fin of student: ");
        fin = scanner.nextFloat();
    }
    void PrintNameAndId(){
        System.out.println("Name of student: " + name + " " + "Id of student: " + id);
    }
    void TotalScoreAndPrint(){
        score = mid*0.4f+fin*0.6f;
        System.out.println("Total score is: " + score);
    }
    
}
