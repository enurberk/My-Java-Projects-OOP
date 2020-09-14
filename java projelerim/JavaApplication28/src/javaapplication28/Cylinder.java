
package javaapplication28;

public class Cylinder extends Circle{

    private double height = 1.0;
	
    Cylinder(double radius,String color ,double height){
	super.getColor();
	super.getRadius();
	this.height=height;
    }
    Cylinder(double radius,double height){
	super.getRadius();
        super.getColor();
	this.height=height;
    }
    Cylinder(double radius){
        super.getRadius();
        super.getColor();
        this.height=height;
    }
    double getHeight() {
	return height;
    }
    void setHeight(double height){
	this.height=height;
    }
    double getVolume() {
	return super.getArea()*getHeight();
    }

}
