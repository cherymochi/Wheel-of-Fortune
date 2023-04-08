package wheel_game;

// Programmer : Nathalea Evans
// Group Members:
//                  Nathalea Evans - 2101707
//                  Lamar Smith -
//                  Kyle Williams - 2111227
// Start Date : Mar 25, 2023
// Due Date : Apr 14, 2023
// Project : Data Structure Group Project - Wheel of Fortune

// Imports
import java.util.Scanner;
import java.io.IOException;

public class Driver { // Start Program Execution
    public static void main(String[] args){

        int choice;
        boolean exit_game = false;

        Manager game = new Manager(); // Create an instance of the game

        while(!exit_game){
            game.mainMenu();

            exit_game = true;

        }
    }
}
