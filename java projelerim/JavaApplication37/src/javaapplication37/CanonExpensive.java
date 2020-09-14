
package javaapplication37;

public class CanonExpensive extends Printer{

    @Override
    public void Scanning() {
        System.out.println("Canon Expensive: Paper is scanning!");    
    }

    @Override
    public void Faxing() {
        System.out.println("Canon Expensive: Paper is faxing!");
    }

    @Override
    public void Colorful() {
        System.out.println("Canon Expensive: Paper is printing colorful!");
    }

    @Override
    public void BlackandWhite() {
        System.out.println("Canon Expensive: Paper is printing black and white!");
    }
}
