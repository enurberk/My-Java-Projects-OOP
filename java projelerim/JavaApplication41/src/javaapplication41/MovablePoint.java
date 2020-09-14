
package javaapplication41;

 public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getxSpeed(){
        return xSpeed;
    }
    public int getySpeed(){
        return ySpeed;
    }
    
    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }
    
    @Override
    public void moveRight() {
        x+=xSpeed;
    }
    
      @Override
    public String toString(){
       return " x: " + x + " | y : " + y ;
    }
//
//package javaapplication41;
//
//public class MovablePoint implements Movable{
//    int x;
//    int y;
//    int xSpeed;
//    int ySpeed;
//
//    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
//        this.x=x;
//        this.y=y;
//        this.xSpeed=xSpeed;
//        this.ySpeed=ySpeed;
//    }
//    
//    public int getX(){
//        return x;
//    }
//    public int getY(){
//        return y;
//    }
//    public int getxSpeed(){
//        return xSpeed;
//    }
//    public int getySpeed(){
//        return ySpeed;
//    }
//    
//    @Override
//    public void moveUp() {
//        y+=ySpeed;
//    }
//
//    @Override
//    public void moveDown() {
//        y-=ySpeed;
//    }
//
//    @Override
//    public void moveLeft() {
//        x-=xSpeed;
//    }
//    
//    @Override
//    public void moveRight() {
//        x+=xSpeed;
//        }
//    }
}
