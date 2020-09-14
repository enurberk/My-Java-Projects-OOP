
package javaapplication26;

public class JavaApplication26 {

    public static void main(String[] args) {
        
        Gamer g1 = new Gamer("NurberK");
        Gamer g2 = new Gamer("Hulya");
        
        GameArena gameArena = new GameArena(g1,g2);
        gameArena.startGame();
    }
    
}
