
package javaapplication50;

public class MovableRectangle implements Movable{
    
    MovablePoint pointUp,pointDown;

    public MovableRectangle(MovablePoint pointUp, MovablePoint pointDown) {
        this.pointUp = pointUp;
        this.pointDown = pointDown;
    }
    @Override
    public void moveUp() {
        pointUp.y-=pointUp.ySpeed;
        pointDown.y-=pointDown.ySpeed;
    }

    @Override
    public void moveDown() {
        pointUp.y+=pointUp.ySpeed;
        pointDown.y+=pointDown.ySpeed;
    }

    @Override
    public void moveLeft() {
        pointUp.x-=pointUp.xSpeed;
        pointDown.x-=pointDown.xSpeed;
    }

    @Override
    public void moveRight() {
        pointUp.x+=pointUp.xSpeed;
        pointDown.x+=pointDown.xSpeed;
    }
    @Override
    public String toString() {
        return "MovableRectangle{" + "pointUp=" + pointUp + ", pointDown=" + pointDown + '}';
    }
}
