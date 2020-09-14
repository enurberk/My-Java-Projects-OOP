
package javaapplication41;

public class JavaApplication41 {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 10, 3, 2);
        MovableCircle circle = new MovableCircle(point, 5);
        
        System.out.println("Before -> x: " + point.getX() + " y: " + point.getY() +  
            " xspeed: " + point.getxSpeed() + " yspeed: " + point.getySpeed());
       
        circle.moveUp();
        System.out.println("After Move Up->" + circle);
        circle.moveDown();
        System.out.println("After Move Down->" + circle);
        circle.moveLeft();
        System.out.println("After Move Left->" + circle);
        circle.moveRight();
        System.out.println("After Move Right->" + circle);
        
    }
    
//package javaapplication41;
//
//public class JavaApplication41 {
//
//    public static void main(String[] args) {
//        MovablePoint point = new MovablePoint(5, 10, 3, 2);
//        MovableCircle circle = new MovableCircle(point, 5);
//        
//        System.out.println("Before -> x: " + point.getX() + " y: " + point.getY() +  
//                " xspeed: " + point.getxSpeed() + " yspeed: " + point.getySpeed());
//       
//        circle.moveUp();
//        System.out.println("After Move Up->" + circle);
//        circle.moveDown();
//        System.out.println("After Move Down->" + circle);
//        circle.moveLeft();
//        System.out.println("After Move Left->" + circle);
//        circle.moveRight();
//        System.out.println("After Move Right->" + circle);
//    
//        MovablePoint point2 = new MovablePoint(4, 15, 5, 6);
//        MovableCircle circle2 = new MovableCircle(point2, 10);
//        
//        System.out.println("Before -> x: " + point2.getX() + " y: " + point2.getY() +  
//                " xspeed: " + point2.getxSpeed() + " yspeed: " + point2.getySpeed());
//       
//        circle2.moveUp();
//        System.out.println("After Move Up->" + circle2);
//        circle2.moveDown();
//        System.out.println("After Move Down->" + circle2);
//        circle2.moveLeft();
//        System.out.println("After Move Left->" + circle2);
//        circle2.moveRight();
//        System.out.println("After Move Right->" + circle2);
//    
//    }
//    
//}

}
