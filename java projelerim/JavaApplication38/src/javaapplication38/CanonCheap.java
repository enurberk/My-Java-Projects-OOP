
package javaapplication38;

public class CanonCheap extends Printer implements Scan,Black{

    @Override
    public void scan() {
        System.out.println("Document is scanning...");
    }

    @Override
    public void black() { 
        System.out.println("Printing black and white...");
    }
    
    @Override
    void printer() {
        System.out.println("This is cheap printer!");
    }
}
