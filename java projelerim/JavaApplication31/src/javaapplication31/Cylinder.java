
package javaapplication31;

class Cylinder extends Shape3D{
    double radius;
    
    public Cylinder(double weight, double height,double depth,double radius) {
        super(weight, height,depth);
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return 2*(3.14*radius*radius+3.14*radius*super.height);
    }
    @Override
    public double getVolume(){
        return 3.14*radius*radius*super.height;
    }
    @Override
    public String toString(){
        return "Cylinder  : " + super.toString() + " radius= " + radius + " area= " + getArea() + " volume= " + getVolume();
    }
}
