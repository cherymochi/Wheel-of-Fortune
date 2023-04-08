package wheel_game;

// Programmer :
// Contributor: Kyle Williams
// Date : Mar 04, 2023
// Wheel(Circular linked list) Class

public class Wheel {
    // Attributes
    private WheelCircularNode firstCard;
    private WheelCircularNode lastCard;
    private WheelCircularNode currentWheelPosition;


    // Default Constructor
    public Wheel(){
        firstCard = null;
        lastCard = null;
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
    public void spinWheel(){    // TODO: 4/8/2023 Whatever card that this function lands on, display the money
    }
    public String landsOn(){    //Returns what the spin wheel function lands on

    }
    public void loseMoneyForRound(){

    }

}
