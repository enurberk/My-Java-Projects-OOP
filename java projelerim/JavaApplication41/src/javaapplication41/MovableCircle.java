
package javaapplication41;

public class MovableCircle extends MovablePoint {
    int radius;

    public MovableCircle(MovablePoint center, int radius) {
        super(center.x, center.y, center.xSpeed, center.ySpeed);
        this.radius=radius;
    }
    
    @Override
    public String toString(){
       return " x: " + this.x + " | y : " + this.y ;
    }
    
//package javaapplication41;
//
//public class MovableCircle implements Movable{
//    int radius;
//    MovablePoint center;
//
//    public MovableCircle(MovablePoint center, int radius) {
//        this.center=center;
//        this.radius=radius;
//    }
//    
//    @Override
//    public void moveUp() {
//        center.y+=center.ySpeed;
//    }
//
//    @Override
//    public void moveDown() {
//        center.y-=center.ySpeed;
//    }
//
//    @Override
//    public void moveLeft() {
//        center.x-=center.xSpeed;
//    }
//
//    @Override
//    public void moveRight() {
//        center.x+=center.xSpeed;
//    }
//    @Override
//    public String toString(){
//       return " x: " + center.x + " | y : " + center.y ;
//    }
//}

}
