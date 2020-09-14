
package javaapplication26;

class GameArena {
    
    Gamer gamer1;
    Gamer gamer2;
    static boolean isGameOver;
    
    GameArena(Gamer g1, Gamer g2) {
        this.gamer1=g1;
        this.gamer2=g2;
    }

    void startGame() {
        
        while(!isGameOver){
        
            gamer1.move();
            gamer2.move();
            GameController.processMove(gamer1 ,gamer2);
            GameController.displayResults(gamer1 ,gamer2);
        }
    }
        
}
