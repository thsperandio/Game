package br.game;

import java.util.Random;

public class Words {
        private String[] randomWords ={"animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights",
                                        "properties", "ceremony", "independence", "beneath", "information", "students", "employee"};
        private String selectedWord;
        private Random random = new Random();
        private char[] letters;
        public Words(){
            selectedWord = randomWords[random.nextInt(randomWords.length)]; //randomWords.length limits the scope to scan

            letters = new char[selectedWord.length()];//length is a Method here that's why it got brackets. String is a n object and has methods
        }
        public String toString() {

            //String word = "";

            StringBuilder text = new StringBuilder();

            for (char letter:letters){

                text.append(letter == '\u0000' ? '-': letter); //Replaces the code below
                text.append(' ');
               /* if (letter == '\u0000'){
                    text.append('-');
                    //word += '-';
                }else {
                    text.append(letter);
                    //word += letter;
                }
                 word += ' '; */
            }
            return text.toString();
            //return word;
    }
    public boolean isGuessedRight(){

            for (char letter: letters){
                if (letter == '\u0000'){
                    return false;
                }
            }
            return true;
    }
    public boolean guess(char letter) { //loop through selected word and check if any of letter is equal to the one being passed to this Method

            boolean isGuessedRight = false; //returns true ou false depending on the guessed letter

            for (int i = 0; i<selectedWord.length(); i++){
                if (letter == selectedWord.charAt(i)){
                    letters [i] = letter;
                    isGuessedRight = true;

                }
            }
            return isGuessedRight;
    }
}
