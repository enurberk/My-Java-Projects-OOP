
package javaapplication26;

import java.util.Scanner;

enum HandSign{
    ROCK,
    SCISSOR,
    PAPER
}

class Gamer {
    
    String name;
    HandSign sign;
    int numberofWins;
    static int numberofDraws;
    static int numberofTrials;
    
    Gamer(String name) {
        this.name=name;
    }

    void move() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi " + this.name + "!" + " Please enter q:quit, s:scissor, p:paper, r:rock");
        boolean isInputInvalid = true;
        do{
            char inChar = input.next().toLowerCase().charAt(0);
            switch(inChar){
                case 'q': 
                    GameArena.isGameOver=true;
                    break;
                case 's':
                    sign = HandSign.SCISSOR;
                    break;
                case 'p':
                    sign = HandSign.PAPER;
                    break;
                case 'r':
                    sign = HandSign.ROCK;
                    break;
                default:
                    System.out.println(this.name + " your input is invalid. Please try again!");
                    isInputInvalid = false;
                    break;
            }
        }
        while(!isInputInvalid);
    }
    
}
