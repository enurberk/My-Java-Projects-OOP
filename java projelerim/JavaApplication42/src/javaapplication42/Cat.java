
package javaapplication42;

public class Cat extends Animal implements Walkable,Swimmable{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("Cat can walk.");
    }

    @Override
    public void swim() {
        System.out.println("Cat can swim.");
    }
}
