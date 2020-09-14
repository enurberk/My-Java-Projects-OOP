
package javaapplication11;

public class JavaApplication11 {

    public static void main(String[] args) {

     Circle c1 = new Circle();
     System.out.println(c1);
        
     Circle c2 = new Circle(2.0);
     c2.setColor("purple");
     System.out.println(c2);
     
     Circle c3 = new Circle(3.0, "pink");
     System.out.println(c3);
    
     Circle c4 = new Circle();
     
     c4.setColor("blue");
     c4.getColor();
     
     c4.setRadius(4.0);
     c4.getColor();
     
     c4.toString();
     System.out.println(c4);
     
     System.out.println("Area: " + c4.getArea());
     System.out.println("Circumference: " + c4.getCircumference());   
     
    }
}
