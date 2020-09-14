
package javaapplication39;

public class Cone extends Shape3D{
    
    public Cone(double height, double radius){
        super(height,radius);
    } 
    
    @Override
    public double getArea() {
        return PI*radius*Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
    }
    @Override
    public double getVolume() {
        return PI*radius*radius*height/3;
    }

    @Override
    public String toString() {
        return "Cone      -> Area :" + this.getArea() + " Volume : " + this.getVolume();
    }
}
