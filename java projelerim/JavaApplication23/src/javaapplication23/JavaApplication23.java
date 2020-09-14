
package javaapplication23;

public class JavaApplication23 {

    public static void main(String[] args) {
        
        Packet packet = new Packet("Laptop", "Istanbul Post Office", "Karabuk Post Office");        
        PostOffice1 p1 = new PostOffice1("Istanbul Post Office");
        PostOffice1 p2 = new PostOffice1("Karabuk Post Office");
        p1.Send(packet);
        p2.Receive(packet);
        
    }
    
}
