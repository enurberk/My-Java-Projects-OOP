
package javaapplication36;

public class Cylinder implements Shape3D{
    double height;
    double radius;
    
    public Cylinder(double height,double radius){
        this.height=height;
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return 2*PI*radius*height*(radius+height);
    }

    @Override
    public double getVolume() {
        return PI*radius*radius*height;
    }
    @Override
    public String toString(){
        return "Cylinder -> " + " Area: " + this.getArea() + " Volume: " + this.getVolume();
    }
}
