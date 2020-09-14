
package javaapplication29;

public class JavaApplication29 {

    public static void main(String[] args) {
        Cat cat = new Cat("black",10);
        Dog dog = new Dog("pink","maltese");
        Animal animal = new Animal("blue");
        cat.color="pink";
        animal.color="black";
        System.out.println(dog.color);
        System.out.println(cat.color);
        System.out.println(animal.color);
    
        BritishShortHair bsh = new BritishShortHair("grey",2,"afafasf");
        bsh.someotherattribute= "yellow hair";
        System.out.println(bsh.color);

        System.out.println(animal);        
        System.out.println(cat);
        
    }
    
}
