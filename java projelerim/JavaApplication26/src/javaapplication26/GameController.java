
package javaapplication26;

class GameController {

    static void processMove(Gamer gamer1, Gamer gamer2) {
        
        if( gamer1.sign == null || gamer2.sign == null || GameArena.isGameOver) return;
        else if(gamer1.sign == gamer2.sign)
            Gamer.numberofDraws++;
        else if(gamer1.sign == HandSign.PAPER && gamer2.sign == HandSign.ROCK)
            gamer1.numberofWins++;
        else if(gamer1.sign == HandSign.ROCK && gamer2.sign == HandSign.SCISSOR)
            gamer1.numberofWins++;
        else if(gamer1.sign == HandSign.SCISSOR && gamer2.sign == HandSign.PAPER)
            gamer1.numberofWins++;
        else
            gamer2.numberofWins++;
        
        Gamer.numberofTrials++;
    }

    static void displayResults(Gamer gamer1, Gamer gamer2) {
        
        System.out.println(gamer1.name + " WINS: " + gamer1.numberofWins + " % " + (Gamer.numberofTrials == 0 ? 0 : (float)gamer1.numberofWins/Gamer.numberofTrials)*100f);
        System.out.println(gamer2.name + " WINS: " + gamer2.numberofWins + " % " + (Gamer.numberofTrials == 0 ? 0 : (float)gamer2.numberofWins/Gamer.numberofTrials)*100f);
        System.out.println("DRAWS: " + Gamer.numberofDraws);
    }
}
