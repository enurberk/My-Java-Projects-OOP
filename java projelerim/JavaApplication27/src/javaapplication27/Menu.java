
package javaapplication27;

public enum Menu {
    HESAPLAR(1),
    BOS_HESAPLAR(2),
    DOLU_HESAPLAR(3),
    BORCLU_HESAPLAR(4);
    int key;
    Menu(int key){
        this.key=key;
    }
}
