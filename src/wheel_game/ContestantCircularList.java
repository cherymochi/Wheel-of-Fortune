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
        boolean nextPlayer = false;
        boolean roundTotalTransaction = false;
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
                    wheel.actionAfterLandsOn(current);
                    if(wheel.landsOn().getCardInfo().getType() == "Loose A Turn") {
                        current.setRoundTotal(0);
                        player++;
                        nextPlayer = true;
                    }
                    read.reset();
                }

                if (nextPlayer == false) {  // loose a turn skip to the other player
                    System.out.println("Have a letter in mind? If yes then type the guess if not the type and enter no.");
                    String value = read.next();

                    if (read.hasNext("no") || read.hasNext("No")) {
                        read.reset();
                    } else {
                        int intFromScanner;
                        do {
                            round.tryToGuess(value);
                            System.out.println("You still have your turn, you can (1) choose to spin again, (2) buy a vowel, or " +
                                    "(3) solve the puzzle. \nPlease type and enter the number corresponding to what you choose.");
                            intFromScanner = read.nextInt();

                            // gameplay for spin again
                            if (intFromScanner == 1) {
                                wheel.spinWheel();
                                wheel.actionAfterLandsOn(current);
                            }

                            // gameplay for buy a vowel
                            else if (intFromScanner == 2) {
                                System.out.println("What vowel do you choose?");
                                if (round.buyVowel((char) read.nextByte()) == false) {
                                    System.out.println("That was an incorrect guess, next player.");
                                    // skip to next player
                                    current = current.getNextNode();
                                }
                            }

                            // gameplay for solve the puzzle
                            else if (intFromScanner == 3) {
                                System.out.println("Type and enter the puzzle answer.");
                                if (round.solvePuzzle(read.next()) == false) {
                                    System.out.println("That was an incorrect guess, next player.");
                                    current.setRoundTotal(0);
                                    // skip to next player
                                    current = current.getNextNode();
                                } else {
                                    // keep money for that round
                                    current.setGrandTotal(current.getContestantInfo().getRoundTotal());
                                }
                            }
                        } while (intFromScanner == 1); // player will continue spining if choice is 1
                        player++;
                    }
                }
            } while (current != head); // list traversal only once

        } catch(Exception general){
            System.err.println("Something went wrong");
        }
    }

}
