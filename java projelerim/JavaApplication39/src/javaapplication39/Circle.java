
package javaapplication39;

public class Circle extends Shape2D{
    
    public Circle(double radius){
        super(radius);
    }
    @Override
    public double getArea(){
        return this.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle    -> Area :" + this.getArea();
    }
}
