
package javaapplication39;

public abstract class Shape2D {
    static final double PI=3.14;
    double height;
    double width;
    
    double radius;
    
    public Shape2D(double height, double width){
        this.height=height;
        this.width=width;
    }

    public Shape2D(double radius){
        this.radius=radius;
    }
    abstract public double getArea();
    abstract public String toString();
}
