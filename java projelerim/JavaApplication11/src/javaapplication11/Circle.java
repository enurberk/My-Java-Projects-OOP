
package javaapplication11;

import java.util.Scanner;

public class Circle {
    
    private double radius = 1.0;
    private String color = "red";
    
    //Constructors
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(){
        radius = 3.0;
        color = "blue";
    }
    //Methods
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
       this.color=color;
    }
    public String getColor(){
       return color;
    }
    public double getArea(){
       return 3.14*radius*radius;
    }
    public double getCircumference(){
       return 2*3.14*radius;
    }
    public String toString(){
      return "Circle [ radius= " + radius + " color= " + color + "]" ;
    }  
}
