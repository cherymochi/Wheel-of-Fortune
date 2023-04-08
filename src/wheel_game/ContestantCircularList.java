package wheel_game;

import java.util.Scanner;

public class ContestantCircularList {
    private ContestantCircularNode head;
    private ContestantCircularNode tail;
    private int sizeOfList;

    // Default Constructor
    public ContestantCircularList(){
        head = null;
        tail = null;
    }

    // Utility Method
    public boolean isEmpty(){
        if (head == null && tail == null){
            return true;
        }
        return false;
    }

    // Solution Methods
    public void addContestantToCircularList(Contestant contestant){
        ContestantCircularNode newNode = new ContestantCircularNode();
        if(newNode != null){
            newNode.setContestantInfo(contestant);
            if (isEmpty()){
                head = newNode;
                tail = newNode;
                tail.setNextNode(head);
            } else{
                tail.setNextNode(newNode);
                tail = newNode;
                tail.setNextNode(head);
            }
            sizeOfList++;
        } else{
            System.err.println("Error. List is full, it can not add a new node. ");
        }
    }

    public void takeTurn(){
        // is the list empty?
        if (isEmpty()){
            System.err.println("list is empty");
            return;
        }

        // Initialization
        int player = 1;
        ContestantCircularNode current = head;
        Scanner read = new Scanner(System.in);
        Wheel wheel = new Wheel();
        Round round = new Round();

        // Solution
        try{
            do{
                System.out.println("Player " + player + " Spin the wheel? type yes or no");
                read.next();
                if (read.hasNext("yes")){
                    wheel.spinWheel();
                    if (wheel.landsOn() == "Bankrupt"){
                        round.roundTotal = 0;
                    } else if()
                    read.reset();
                }

                System.out.println("Have a letter in mind? If yes then type the guess if not the type and enter no.");
                String value = read.next();

                if (read.hasNext("no") || read.hasNext("No")){
                    read.reset();
                } else{
                    round.tryToGuess(value);
                    System.out.println("You still have your turn, you can (1) choose to spin again, (2) buy a vowel, or " +
                            "(3) solve the puzzle. \nPlease type and enter the number corresponding to what you choose.");
                    read.nextInt();

                    // gameplay for spin again
                    if (read.hasNextInt(1)){
                        wheel.spinWheel();
                        // skip to next player
                        current = current.getNextNode();
                    }

                    // gameplay for buy a vowel
                    else if (read.hasNextInt(2)){
                        System.out.println("What vowel do you choose?");
                        if (round.buyVowel((char) read.nextByte()) == false){
                            System.out.println("That was an incorrect guess, next player.");
                            // skip to next player
                            current = current.getNextNode();
                        }
                    }

                    // gameplay for solve the puzzle
                    else if (read.hasNextInt(3)) {
                        System.out.println("Type and enter the puzzle answer.");
                        if (round.solvePuzzle(read.next()) == false) {
                            System.out.println("That was an incorrect guess, next player.");
                            // skip to next player
                            current = current.getNextNode();
                        } else {
                            // keep money for that round
                            current.setGrandTotal(round.roundTotal);
                        }
                    }
                }
            } while (current != head); // list traversal

        } catch(Exception general){
            System.err.println("Something went wrong");
        }
    }

}
