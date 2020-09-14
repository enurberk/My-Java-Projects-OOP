
package javaapplication21;


public class JavaApplication21 {
    
    public static void main(String[] args) {
        
        Circle c1 = new Circle(1, "pink");
        System.out.println(c1.getRadius()+" "+c1.getColor());
        Circle c2 = new Circle(4.0);
        System.out.println(c2.getRadius()+" "+c2.getColor());
        Circle c3 = new Circle();
        System.out.println(c3);
        c3.setColor("blue");
        c3.setRadius(6.0);
        System.out.println(c3.getColor()+" "+c3.getRadius());
        System.out.println(c3.getArea());
        System.out.println(c3.getCircumference());
        System.out.println(c3);//or System.out.println(c3.toString());
        
    }
    
}
