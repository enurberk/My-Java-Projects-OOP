// procedure -oriented programming ile yazıldı bu kodlar
//nesne kullanılmadan!!!
package javaapplication4;

 
public class JavaApplication4 {


    public static void main(String[] args) {
        
        CalculateScore("Jack", 65, 98);
        CalculateScore("Jane", 100, 99);
 }
    static void CalculateScore(String name, float mid, float fin)
    {
        float score= mid* 0.4f + fin* 0.6f;
        
        System.out.println("name: " + name + " " + "score: " + score);
    }
}
