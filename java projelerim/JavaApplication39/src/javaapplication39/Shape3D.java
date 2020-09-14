
package javaapplication39;

public abstract class Shape3D extends Shape2D{
    double depth;
    
    public Shape3D(double height,double width,double depth){
        super(height,width);
        this.depth=depth;
    }
    
    
    public Shape3D(double height,double radius){
    super(radius);
    this.height=height;
    }
    
   public Shape3D(double radius){
    super(radius);
    }
    

    abstract public double getVolume();    
}
