
package javaapplication16;

public class JavaApplication16 {


    public static void main(String[] args) {
            
        try
        {
            Time1 t1 = new Time1(14, 9, 25);
            System.out.println(t1.toUniversal());
            System.out.println(t1);//t1.toString() aynı anlam
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
