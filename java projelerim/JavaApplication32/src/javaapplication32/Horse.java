
package javaapplication32;

public class Horse extends Animal{
    int maxSpeed;
    void neigh(){
        System.out.println("neighhhhhh!!!");
    }
    @Override
    void eat(){
        System.out.println("horse is eating...");
    }
    
}
