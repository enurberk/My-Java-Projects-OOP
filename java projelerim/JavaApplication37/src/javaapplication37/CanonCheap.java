
package javaapplication37;

public class CanonCheap extends Printer{

    @Override
    public void Scanning() {
        System.out.println("Canon Cheap: Paper is scanning!");    
    }

    @Override
    public void Faxing() {
        System.out.println("Canon Cheap: This printer not allowed to faxing!");
    }

    @Override
    public void Colorful() {
        System.out.println("Canon Cheap: This printer not allowed to print colorful!");
    }

    @Override
    public void BlackandWhite() {
        System.out.println("Canon Cheap: Paper is printing black and white!");
    }
    
}
