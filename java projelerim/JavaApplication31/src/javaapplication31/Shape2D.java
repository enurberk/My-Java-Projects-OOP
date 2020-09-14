
package javaapplication31;

public abstract class Shape2D {
    double weight;
    double height;
    
    public Shape2D(double weight,double height) {
        this.height=height;
        this.weight=weight;
    }
    public abstract double getArea();
    public abstract double getVolume();
    
    public String toString(){
        return "weight= " + weight + " height= " + height;
    }
}
