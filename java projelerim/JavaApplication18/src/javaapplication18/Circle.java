
package javaapplication18;

public class Circle {

    private int radius;
    private final static double PI = 3.14159;    

    public Circle(int radius){
        this.radius=radius;
    }
    
    public double getArea(){
        return PI*radius*radius;
       //return Math.PI*radius*radius;//with java library or class
       //return Math.pow(2, 2);
    }
    
}
