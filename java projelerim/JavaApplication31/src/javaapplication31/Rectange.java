
package javaapplication31;

class Rectange extends Shape2D{
    
    public Rectange(double weight, double height) {
        super(weight, height);
    }
    @Override
    public double getArea() {
        return super.height*super.weight;
    }

    @Override
    public double getVolume() {
     return 0.0;
    }
    @Override
     public String toString(){
        return "Rectangle : " +  super.toString() + " area= " + getArea() + " volume= " + getVolume();
    }
}
