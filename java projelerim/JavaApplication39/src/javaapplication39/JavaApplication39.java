
package javaapplication39;

public class JavaApplication39 {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(5, 10);
        Cylinder cylinder = new Cylinder(10, 2);
        Sphere sphere = new Sphere(5);
        Pyramid pyramid = new Pyramid(10, 8, 5);
        Cone cone = new Cone(10, 5);
        
        Shape2D[] shapes2 = new Shape2D[]{circle,square,rectangle};
        System.out.println("********** Shape 2D **********");
        for(Shape2D shape : shapes2)
            System.out.println(shape.toString());
        
        Shape3D[] shapes3 = new Shape3D[]{cylinder,sphere,pyramid,cone};
        System.out.println("********** Shape 3D **********");
        for(Shape3D shape : shapes3)
            System.out.println(shape.toString());
        
    }
}
