
package javaapplication36;

public class Rectangle implements Shape2D{
    double height;
    double width;
    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea() {
        return height*width;
    }
    @Override
    public String toString(){
        return "Rectangle -> " + " Area: " + this.getArea();
    }
}
