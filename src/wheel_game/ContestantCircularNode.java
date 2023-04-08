package wheel_game;

// Programmer : Kyle Williams
// Date : Mar 28, 2023
// ContestantCircularNode Class

public class ContestantCircularNode {

    // Attributes
    private Contestant contestantInfo;
    private ContestantCircularNode nextNode;

    // Default Constructor
    ContestantCircularNode(){
        contestantInfo = new Contestant();
        nextNode = null;
    }

    // Copy Constructors
    public ContestantCircularNode(Contestant contestantInfo) {
        this.contestantInfo = contestantInfo;
    }

    public ContestantCircularNode(ContestantCircularNode nextNode) {
        this.nextNode = nextNode;
    }

    // Getters
    public Contestant getContestantInfo() {
        return contestantInfo;
    }

    public ContestantCircularNode getNextNode() {
        return nextNode;
    }

    // Setters
    public void setContestantInfo(Contestant contestantInfo) {
        this.contestantInfo = contestantInfo;

    }

    public void setGrandTotal(float grandTotal){
        this.contestantInfo.setGrandTotal(grandTotal);
    }

    public void setNextNode(ContestantCircularNode nextNode) {
        this.nextNode = nextNode;
    }
}
