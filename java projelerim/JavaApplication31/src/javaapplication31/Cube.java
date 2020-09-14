
package javaapplication31;

class Cube extends Shape3D{
    
    public Cube(double weight, double height,double depth) {
        super(weight, height,depth);
    }
    @Override
    public double getArea(){
        return 6*(weight*height)*(weight*height);
    
    }
    @Override
    public double getVolume(){
        return super.depth*super.height*super.weight;
    }
    @Override
    public String toString(){
        return "Cube      : " + super.toString() + " area= " + getArea() + " volume= " + getVolume();
    }
}
