
package javaapplication38;

public class CanonExpensive extends Printer implements Scan,Fax,Color,Black {

    @Override
    public void scan() {
        System.out.println("Document is scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Document is faxing...");
    }

    @Override
    public void color() {
        System.out.println("Color printing....");
    }

    @Override
    public void black() { 
        System.out.println("Printing black and white...");
   }

    @Override
    void printer() {
        System.out.println("This is expensive printer!");
    }
}
