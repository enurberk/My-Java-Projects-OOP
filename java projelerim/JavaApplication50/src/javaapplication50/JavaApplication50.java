
package javaapplication50;

public class JavaApplication50 {

    public static void main(String[] args) {
        
        MovablePoint point1 = new MovablePoint(5, 10, 2, 3);
        MovablePoint point2 = new MovablePoint(10, 5, 2, 3);
        MovableRectangle rectangle = new MovableRectangle(point1, point2);
       
        MovablePoint point3 = new MovablePoint(5, 10, 5, 6);
        MovablePoint point4 = new MovablePoint(10, 5, 5, 6);
        MovableRectangle rectangle2 = new MovableRectangle(point3, point4);
        
        
        System.out.println("\n***************\n");
        System.out.println("Before move!\n");
        System.out.println("Rectangle-> " + rectangle);
        System.out.println("Point1-> " + point1);
        System.out.println("Point2-> " + point2);
        
        System.out.println("\n***************\n");
        System.out.println("After movedown!\n");
        rectangle.moveDown();
        System.out.println("Rectangle-> " + rectangle);
        System.out.println("Point1-> " + point1);
        System.out.println("Point2-> " + point2);

        
        System.out.println("\n***************\n");
        System.out.println("Before move!\n");
        System.out.println("Rectangle-> " + rectangle2);
        System.out.println("Point1-> " + point3);
        System.out.println("Point2-> " + point4);
        
        
        System.out.println("\n***************\n");
        System.out.println("After moveup!(with new xspeed and yspeed)\n");
        rectangle2.moveUp();
        System.out.println(rectangle2);
        System.out.println("Point1-> " + point3);
        System.out.println("Point2-> " + point4);
        
        
        System.out.println("\n***************\n");
        System.out.println("After moveleft!\n");
        rectangle.moveLeft();
        System.out.println("Rectangle-> " + rectangle);
        System.out.println("Point1-> " + point1);
        System.out.println("Point2-> " + point2);

        System.out.println("\n***************\n");
        System.out.println("Before move!\n");
        System.out.println("Rectangle-> " + rectangle2);
        System.out.println("Point1-> " + point3);
        System.out.println("Point2-> " + point4);
        
        System.out.println("\n***************\n");
        System.out.println("After moveright!(with new xspeed and yspeed)\n");
        rectangle2.moveRight();
        System.out.println("Rectangle-> " + rectangle2);
        System.out.println("Point1-> " + point3);
        System.out.println("Point2-> " + point4);

    }
    
}
