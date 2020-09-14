
package javaapplication32;

public class Dog extends Animal{
    String breed;
    
    void bark(){
        System.out.println("hav hav hav!!!");
    }
    @Override
    void eat(){
        System.out.println("dog is eating...");
    }
}
