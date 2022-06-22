package br.game;

public class GuessTheWord {
    private boolean play = false;
    private Words randomWord = new Words();
    public void start(){

        do {
            showWord();
            getInput();
            checkInpute();

        }while (play);
    }
    void showWord(){
        System.out.println(randomWord);
    }
    void getInput(){
        System.out.println("getInput");
    }
    void checkInpute(){
        System.out.println("checkInput");
    }
}
