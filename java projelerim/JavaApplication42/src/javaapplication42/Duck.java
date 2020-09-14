
package javaapplication42;

public class Duck extends Animal implements Movable,Flyable,Swimmable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Duck can move.");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly.");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim.");
    }   
}
