
package javaapplication28;

public class JavaApplication28 {

    public static void main(String[] args) {
        
        Circle c1 = new Circle(1, "pink");
        System.out.println(c1);
        System.out.println(c1.getRadius()+" "+c1.getColor());
        System.out.println("***********************");
        
        Circle c2 = new Circle(4.0);
        System.out.println(c2);
        System.out.println(c2.getRadius()+" "+c2.getColor());
        System.out.println("***********************");
        
        Circle c3 = new Circle();
          System.out.println(c3);
//        System.out.println(c3.getRadius()+" "+c3.getColor());
//        c3.setColor("blue");
//        c3.setRadius(6.0);
//        System.out.println(c3);
        System.out.println("Area: " + c3.getArea());
        System.out.println("***********************");
        
        Cylinder cy1 = new Cylinder(1.0,"pink", 2.0);
        System.out.println("Height: " + cy1.getHeight());
	System.out.println("Volume: " + cy1.getVolume());
        System.out.println("Color: " + cy1.getColor());
        System.out.println("***********************");
        
        Cylinder cy2 = new Cylinder(2.0, 3.0);
        System.out.println("Height: " + cy2.getHeight());
	System.out.println("Volume: " + cy2.getVolume());
        System.out.println("Color: " + cy2.getColor());
        System.out.println("***********************");
        
        Cylinder cy3 = new Cylinder(5.0);
        System.out.println("Height: " + cy3.getHeight());
	System.out.println("Volume: " + cy3.getVolume());
        System.out.println("Color: " + cy3.getColor());
        System.out.println("***********************");

    }
    
}
