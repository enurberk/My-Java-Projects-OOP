
package javaapplication39;

public class Cylinder extends Shape3D{

    public Cylinder(double height, double radius) {
        super(height, radius);
    }
    @Override
    public double getArea() {
        return 2*PI *radius*height + 2*PI*radius*radius;
    }
    @Override
    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {
       return "Cylinder  -> Area :" + getArea() + " Volume : " + getVolume();
    }
}
