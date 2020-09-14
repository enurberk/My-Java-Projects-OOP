

package javaapplication12;


public class JavaApplication12 {

    
    public static void main(String[] args) {
        Account ac = new Account("Mehmet", 1500);
        
        ac.withDraw(-100);
        System.out.println(ac.getBalance());
        
        ac.withDraw(500);
        System.out.println(ac.getBalance());
        
        ac.withDraw(600);
        System.out.println(ac.getBalance());
        
        ac.withDraw(400);
        System.out.println(ac.getBalance());
    }
    
}
