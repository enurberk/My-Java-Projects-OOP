
package javaapplication1;

import java.util.Scanner;


public class Circle {
    
    //attributes
    double radius;
    double area;
    String color;
    Scanner scanner = new Scanner(System.in);
    
    //behaviours
    void inputFromKeyboradRadius(){
        System.out.println("Please enter radius of circle:");
        radius = scanner.nextDouble();
    }
    
    void inputFromKeyboardColor(){
        System.out.println("Please enter color of circle:");
        color = scanner.next();
    }
    
    void getAndSetArea(){
        area = 3.1415*radius*radius;
        System.out.println("The area of circle:" + area);
    }
    
    void setColor(){
        System.out.println("The color of circle: " + color);
    }
    
}
