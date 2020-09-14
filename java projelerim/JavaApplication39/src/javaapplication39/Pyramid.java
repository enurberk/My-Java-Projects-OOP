
package javaapplication39;

public class Pyramid extends Shape3D{
    
    public Pyramid(int height, int width, int  depth){
        super(height,width,depth);
    }

    @Override
    public double getArea() {
        return depth*width + depth * Math.sqrt(Math.pow(width/2, 2));
    }
    @Override
    public double getVolume() {
        return this.getArea()*height/3;
    }

    @Override
    public String toString() {
       return "Pyramid   -> Area :" + this.getArea() + " Volume : " + this.getVolume();
    }
}
