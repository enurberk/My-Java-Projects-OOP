
package javaapplication23;

public class PostOffice1 {
    
    private String name;
    
    public PostOffice1(String n){
        this.name=n;
    }
    void Send(Packet p){
        System.out.println(p.getMessage() + " has been sent to " + p.getTargetAdress() + " by " + this.name);
    }
    void Receive(Packet p){
        System.out.println(p.getMessage() + " has been received from " + p.getSourceAdress() + " by " + this.name);
    }
    
}
