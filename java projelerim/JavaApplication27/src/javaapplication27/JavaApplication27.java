
package javaapplication27;

import java.util.Scanner;
import static javafx.application.Platform.exit;

public class JavaApplication27 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Seçim yapınız->\n1-)HESAPLAR\n2-)BOŞ HESAPLAR\n3-)DOLU HESAPLAR\n4-)BORÇLU HESAPLAR\n5-)ÇIKIŞ");
    int seçim=scanner.nextInt();
//        switch(seçim){
//            case 1: System.out.println(Menu.HESAPLAR.key);
//                break;
//            case 2: System.out.println(Menu.BOS_HESAPLAR);
//                break;
//            case 3: System.out.println(Menu.DOLU_HESAPLAR);
//                break;
//            case 4: System.out.println(Menu.BORCLU_HESAPLAR);
//                break;
//            }
        if(seçim==Menu.HESAPLAR.key){
            System.out.println(Menu.HESAPLAR);
        }
        else if(seçim==Menu.BOS_HESAPLAR.key){
            System.out.println(Menu.BOS_HESAPLAR);
        }
        else if(seçim==Menu.DOLU_HESAPLAR.key){
            System.out.println(Menu.DOLU_HESAPLAR);
        }
        else if(seçim==Menu.BORCLU_HESAPLAR.key){
            System.out.println(Menu.BORCLU_HESAPLAR);
        }
        else{
         // System.out.println("yanlış giriş yaptınız.");
        exit();
        }
    }
}
