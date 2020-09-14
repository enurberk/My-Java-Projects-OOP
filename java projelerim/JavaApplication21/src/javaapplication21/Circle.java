
package javaapplication21;

public class Circle {

    private static final double default_radius = 1.0;
    private static String default_color = "red";
    
    private double radius1;
    private String color1;
    
    public Circle(double radius, String color){
        this.radius1 = radius;
        this.color1 =color;
    }
    public Circle(double radius){
        this.radius1=radius;
        this.color1=default_color;
    }
    public Circle(){
        this.color1=default_color;
        this.radius1=default_radius;
    }
    double getRadius(){
        return radius1;
    }
    void setRadius(double radius1){
        this.radius1=radius1;
    }
    String getColor(){
        return color1;
    }
    void setColor(String color1){
        this.color1=color1;
    }
    public String toString(){
        return "radius: " + default_radius + " color: " + default_color;
    }
    double getArea(){
        return 3.14*default_radius*default_radius;
    }
    double getCircumference(){
        return 2*3.14*default_radius;
    }
}
