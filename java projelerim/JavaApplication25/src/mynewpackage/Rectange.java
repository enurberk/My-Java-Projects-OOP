
package mynewpackage;

public class Rectange {
    
    private int x,y;
    private int width,height;
    
    public Rectange(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    public Rectange(int width, int height){
        this(0, 0, width, height);
    }
    public Rectange(){
        this(0, 0, 1, 1);
    }
    
    public float getArea(){
        return this.width * this.height;
    }
}
