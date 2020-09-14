
package javaapplication36;

public class Circle implements Shape2D{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return PI*radius*radius;
    }   
    @Override
    public String toString(){
        return "Circle -> " + " Area: " + this.getArea();
    }
}
