
package javaapplication38;

public class JavaApplication38 {

    public static void main(String[] args) {
        CanonCheap cheap = new CanonCheap();
        CanonExpensive expensive = new CanonExpensive();        
//        Printer[] printers = new Printer[]{cheap,expensive};
//        
//        for(Printer printer : printers){
//            printer.printer();
//        }
        cheap.printer();
        cheap.black();
        cheap.scan();
        System.out.println("************");
        expensive.printer();
        expensive.black();
        expensive.color();
        expensive.scan();
        expensive.fax();
        
        
    }
    
}
