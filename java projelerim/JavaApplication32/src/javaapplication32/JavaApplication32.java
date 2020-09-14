
package javaapplication32;

public class JavaApplication32 {

    public static void main(String[] args) {
        
        Cat cat = new Cat();
        Horse horse = new Horse();
        
        Animal dog = new Dog();
        dog.eat();//dog.bark(); gelmiyor çünkü Animal dan dog ürettik. Dog is a Animal!
        System.out.println(dog.color="black");
        ((Dog)dog).bark();
        
        System.out.println("*************");
        System.out.println(cat.color + " " + cat.age);
        
        System.out.println("*************");
        Animal animal = new Cat();
        //Animal animal = (Animal) cat;//upcasting-Animal animal=nesne ürettik animal'ı---devamında upcasting ile cat i atadık!
        animal.eat();//burda animal.meow(); gelmez çünkü o hayvan artık. kedi değil!cat is a animal.
        ((Cat)animal).meow();//downcasting-ile kedi hayvandan tekrar kedi oldu!
        
        System.out.println("*************");
        animal = horse;//upcasting--animal pointerı artık horse u gösteriyor.horse is a animal!
        animal.eat();//animal.neigh(); çalışmaz çünkü horse artık animal at değil!
        ((Horse)animal).neigh();//downcasting-ile horse tekrar at özelliklerini kazandırdık.!
        
        System.out.println("*************");
        animal= (Animal)dog;
        animal.eat();
        ((Dog)animal).bark();
    }
    
}
