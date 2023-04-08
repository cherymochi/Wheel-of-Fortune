package wheel_game;

// Programmer : Nathalea Evans
// Date : Mar 28, 2023
// Guess Class

public class Guess {
    // Attributes
    String guess;

    // Default Constructor
    Guess(){
        this.guess = "";
    }

    // Primary Constructor
    Guess(String g){
        this.guess = g;
    }

    // Getters
    public String getGuess(){
        return guess;
    }

    // Setters

    public void setGuess(String guess) {
        this.guess = guess;
    }


    // Other Methods
}
