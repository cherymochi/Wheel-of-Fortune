package wheel_game;

// Programmer : Nathalea Evans
// Date : Mar 28, 2023
// Manager Class

// Imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.*;

public class Manager {
    // Attributes
    private int round_num = 0;
    private int puzzles = 0;
    private int card =  0;



    // Getters
    public int getRound_num() {
        return round_num;
    }

    // Setters
    public void setRound_num(int round_num) {
        this.round_num = round_num;
    }


    // Other Methods
    public void mainMenu(){
        System.out.println("\t--------------------------------------------------------------------");
        System.out.println("\t|                   GAME SHOW NETWORK PRESENTS                     |");
        System.out.println("\t|                        WHEEL OF FORTUNE                          |");
        System.out.println("\t--------------------------------------------------------------------\n");
        System.out.println("\t--------------------------------------------------------------------");
        System.out.println("\t|                       >>>__Main Menu__<<<                        |");
        System.out.println("\t--------------------------------------------------------------------\n\n");
        System.out.println("|\t\tEnter 1 to start game.");
        System.out.println("|\t\tEnter 0 to exit.\n");
        System.out.println("|\t\tYour Choice: ");
        Scanner choice




    }
}
