package br.game;

import java.util.Scanner;

public class GuessTheWord {
    private boolean play = true;
    private Words randomWord = new Words();

    private Scanner scanner = new Scanner(System.in);
    public void start(){

        do {
            showWord();
            getInput();
            checkInput();

        }while (play);
    }
    void showWord(){
        System.out.println(randomWord);
    }
    void getInput(){
        System.out.println("Enter a letter to guess the word: ");
        String userGuess = scanner.nextLine();
        randomWord.guess(userGuess.charAt(0)); //to get the first letter from user input
    }
    void checkInput(){
        System.out.println("checkInput");
    }

    public void end() {
        scanner.close();
    }
}
