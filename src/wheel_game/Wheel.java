package wheel_game;

// Programmer :
// Contributor: Kyle Williams
// Date : Mar 04, 2023
// Wheel(Circular linked list) Class

import java.util.Random;

public class Wheel {
    // Attributes
    private WheelCircularNode firstCard;
    private WheelCircularNode lastCard;
    private WheelCircularNode currentWheelPosition; // special pointer


    // Default Constructor
    public Wheel(){
        firstCard = null;
        lastCard = null;
        currentWheelPosition = null;
    }

    // Utility Method
    public boolean isEmpty(){
        if (firstCard == null && lastCard == null){
            return true;
        }
        return false;
    }

    // Solution Methods
    public void addCardToList(Card card){
        WheelCircularNode newCard = new WheelCircularNode();
        if(newCard != null){
            newCard.setCardInfo(card);
            if (isEmpty()){
                firstCard = newCard;
                lastCard = newCard;
                lastCard.setNextNode(firstCard);
            } else{
                lastCard.setNextNode(newCard);
                lastCard = newCard;
                lastCard.setNextNode(firstCard);
            }
        } else{
            System.err.println("Error. List is full, it can not add a new node. ");
        }
    }
    public WheelCircularNode spinWheel(){
        // random number
        Random random = new Random();
        int numberOfSkips = random.nextInt(51) + 50;

        while (numberOfSkips != 0 ){
            currentWheelPosition = currentWheelPosition.getNextNode();
            numberOfSkips--;
        }

        return currentWheelPosition;
    }
    public WheelCircularNode landsOn(){    //Returns what the spin wheel function lands on
        return currentWheelPosition;
    }
    public void addAllCards(){
        Card card = new Card("Money", 2500);
        addCardToList(card);
        card = new Card("Loose A Turn", 0);
        addCardToList(card);
        card = new Card("Money", 600);
        // add all cards
    }
    public void actionAfterLandsOn(ContestantCircularNode node){
        WheelCircularNode wheelPositionData = landsOn();
        wheelPositionData.getCardInfo().display();
        if (landsOn().getCardInfo().getType() == "Bankrupt"){
            node.setRoundTotal(0);
        } else if (wheelPositionData.getCardInfo().getType() == "Money"){
            node.setRoundTotal(wheelPositionData.getCardInfo().getValue());
        }
    }

}
