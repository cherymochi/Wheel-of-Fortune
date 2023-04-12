package wheel_game;

public class WheelCircularNode {
    // Attributes
    private Card cardInfo;
    private WheelCircularNode nextNode;

    // Constructors
    public WheelCircularNode(){
        cardInfo = new Card();
        nextNode = null;
    }
    public WheelCircularNode(Card cardInfo) {
        this.cardInfo = cardInfo;
    }
    public WheelCircularNode(WheelCircularNode nextNode) {
        this.nextNode = nextNode;
    }

    // Getters
    public Card getCardInfo() {
        return cardInfo;
    }
    public WheelCircularNode getNextNode() {
        return nextNode;
    }

    // Setters
    public void setCardInfo(Card cardInfo) {
        this.cardInfo = cardInfo;
    }
    public void setNextNode(WheelCircularNode nextNode) {
        this.nextNode = nextNode;
    }
}
