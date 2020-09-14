
package javaapplication28;

public class Circle {

    private static final double default_radius = 1.0;
    private static final String default_color = "red";
    
    private double radius;
    private String color;
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color =color;
    }
    public Circle(double radius){
        this.color=default_color;
        this.radius=radius;
    }
    public Circle(){
        this(default_radius,default_color);
//        this.color=default_color;
//        this.radius=default_radius;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius1){
        this.radius=radius;
    }
    String getColor(){
        return color;
    }
    void setColor(String color1){
        this.color=color;
    }
    public String toString() {
	return "Circle[radius = " + getRadius() + ", color = " + getColor() + " ]";
    }
    double getArea(){
        return 3.14*getRadius()*getRadius();
    }
}
