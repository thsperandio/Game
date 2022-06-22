package br.game;

public class Words {

        private String[] randomWords ={"animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights",
                "properties", "ceremony", "independence", "beneath", "information", "students", "employee"};


        private String selectedWord;
        public Words(){
            selectedWord = randomWords[3];

        }

         public String toString() {
        return selectedWord;
    }
}
