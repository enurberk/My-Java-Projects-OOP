
package javaapplication36;

public class Cube implements Shape3D{
    double height;
    double width;
    double depth;
    public Cube(double height,double width,double depth){
        this.depth=depth;
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea() {
        return 6*height*height;
    }

    @Override
    public double getVolume() {
        return height*height*height;
    }
    @Override
    public String toString(){
        return "Cube -> " + " Area: " + this.getArea() + " Volume: " + this.getVolume();
    }
}
