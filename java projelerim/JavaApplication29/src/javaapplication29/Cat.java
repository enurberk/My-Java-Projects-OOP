
package javaapplication29;

public class Cat extends Animal{
    int age;
    public Cat(String color, int age){
        super(color);
        this.age=age;
    }
    public void meow(){};
    public String toString(){
        return super.toString() + " test";
    }
}

