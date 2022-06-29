package br.game;

import java.util.Scanner;

public class GuessTheWord {
    private boolean play = true;
    private Words randomWord = new Words();
    private Scanner scanner = new Scanner(System.in);

    private int rounds = 10;
    private char lastRound;
    public void start(){

        do {
            showWord();
            getInput();
            checkInput();

        }while (play);
    }
    void showWord(){

        System.out.println("You have " + rounds + " tries left");
        System.out.println(randomWord);
    }
    void getInput(){
        System.out.println("Enter a letter to guess the word: ");
        String userGuess = scanner.nextLine();
        lastRound =userGuess.charAt(0);
    }
    void checkInput(){

       boolean isGuessedRight = randomWord.guess(lastRound); //to get the first letter from user input

        if (isGuessedRight) { //Nested if statement, checks if the whole word is guessed right
            if (randomWord.isGuessedRight()) {
                System.out.println("Congrats you won!");
                System.out.println("The word is " + randomWord);
                play = false; //it stops the gaming from running
            }
        }
        else {
            rounds--; //decrements the rounds
            if (rounds == 0){
                System.out.println("The Game is Over");
                play = false;
            }
        }
    }
    public void end() {
        scanner.close();
    }
}
