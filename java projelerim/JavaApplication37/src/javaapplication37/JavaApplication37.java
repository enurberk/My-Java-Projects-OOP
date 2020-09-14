
package javaapplication37;

public class JavaApplication37 {

    public static void main(String[] args) {
        CanonExpensive c1 = new CanonExpensive();
        CanonCheap c2 = new CanonCheap();
        Printer[] printers = new Printer[]{c1,c2};
        for(Printer printer : printers){
            printer.BlackandWhite();
            printer.Colorful();
            printer.Faxing();
            printer.Scanning();
        }
    }
    
}