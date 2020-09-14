
package javaapplication31;

public class JavaApplication31 {

    public static void main(String[] args) {
    
        Rectange c1 = new Rectange(2.0,6.0);
        Cylinder c2 = new Cylinder(0.0,5.0,0.0,1.0);
        Circle c3 = new Circle(0.0,0.0,2.0);
        Cube c4 = new Cube(2.0,2.0,2.0);
        
        Shape2D[] shape2d = new Shape2D[]{c1,c3};
        for(Shape2D s2 : shape2d){
            System.out.println(s2.toString());
        }
        Shape3D[] shape3d = new Shape3D[]{c2,c4};
        for(Shape3D s3 : shape3d){
            System.out.println(s3.toString());
        }
    }
    
}
