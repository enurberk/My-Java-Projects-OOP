
package javaapplication31;

public abstract class Shape3D extends Shape2D{
    double depth;
    public Shape3D(double weight, double height,double depth) {
        super(weight, height);
        this.depth=depth;
    }
    @Override
     public String toString(){
        return super.toString() + " depth= " + depth;
    }
}
