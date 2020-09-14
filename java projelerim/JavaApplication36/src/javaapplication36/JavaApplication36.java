
package javaapplication36;

public class JavaApplication36 {

    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        Cube cube = new Cube(5.0,5.0,5.0);
        Cylinder cylinder = new Cylinder(10.0,3.0);
        
        System.out.println(circle);
        System.out.println(rectangle);        
        System.out.println(cube);        
        System.out.println(cylinder);        
        
    }
}
