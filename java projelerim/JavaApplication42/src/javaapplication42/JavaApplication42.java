
package javaapplication42;

public class JavaApplication42 {

    public static void main(String[] args) {
        Duck duck = new Duck("Daffy Duck");
        Cat cat = new Cat("Tom");
        Eagle eagle = new Eagle("Angry Birds");
        
        System.out.println("Duck-> " + duck.name);
        duck.fly();
        duck.move();
        duck.swim();
        System.out.println("Cat-> " + cat.name);
        cat.swim();
        cat.walk();
        System.out.println("Eagle-> " + eagle.name);        
        eagle.fly();
    }
}
