
package javaapplication34;

public class Test implements A,B{
    
    @Override
    public void a(){
        System.out.println("from interface A");
    }
    @Override
    public void b(){
        System.out.println("from interface B");
    }
}
