
package javaapplication32;

public class Cat extends Animal{
    int age;
    public Cat() {
        super.color="pink";
        this.age=5;
    }
    void meow(){
        System.out.println("meowwwwww!!!");
    }
    @Override
    void eat(){
        System.out.println("cat is eating...");
    }
}
