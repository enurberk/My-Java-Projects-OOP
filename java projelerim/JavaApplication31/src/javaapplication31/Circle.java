
package javaapplication31;

class Circle extends Shape2D{
    double radius;
    public Circle(double weight, double height, double radius) {
        super(weight, height);
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }

    @Override
    public double getVolume() {
       return 0.0;
    }
    @Override
    public String toString(){
        return "Circle    : " + super.toString() + " radius= " + radius + " area= " + getArea() + " volume= " + getVolume();
    }
}
