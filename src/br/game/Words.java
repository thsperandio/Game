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
                if (letter == '\u0000'){
                    text.append('-');
                    //word += '-';
                }else {
                    text.append(letter);
                    //word += letter;
                }
                text.append(' ');
               // word += ' ';
            }
            return text.toString();
            //return word;
    }
}
