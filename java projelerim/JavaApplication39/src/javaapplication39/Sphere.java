
package javaapplication39;

public class Sphere extends Shape3D{


    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return 4/3*this.getArea()*radius;
    }

    @Override
    public double getArea() {
        return 4*PI * radius *radius;
    }

    @Override
    public String toString() {
        return "Sphere    -> Area :" + this.getArea() + " Volume : " + this.getVolume();
    }
    
}
