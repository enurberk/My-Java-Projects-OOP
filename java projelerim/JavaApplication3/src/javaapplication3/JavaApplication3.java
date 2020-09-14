// procedure -oriented programming ile yazıldı bu kodlar
//nesne kullanılmadan!!!
package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        
        //attributes 
        String name = "Jack";
        float mid = 56f;
        float fil = 95f;
        //methods
        float totalScore = mid* 0.4f + fil* 0.6f;
        //ekrana yazdır
        System.out.println("Name: " + name);
        System.out.println("Total score: " + totalScore);
        
    }
}
