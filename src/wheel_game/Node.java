package wheel_game;

// Programmer : Nathalea Evans
// Date : Mar 28, 2023
// Guess Class



public class Node {

    private Contestant player_Data;
    private Card card_Data;
    private Puzzle puzzle_Data;
    private Node guess_Data;
    private Node prev;
    private Node next;



    //default constructor
    public Node()
    {

    }


    //primary constructor
    public Node(Contestant player)
    {
        this.player_Data = player;
    }

    public Node(Card Data)
    {
        this.card_Data = Data;
    }

    public Node(Puzzle Word)
    {
        this.puzzle_Data = Word;
    }

    public Node(Card Data, Puzzle Word, Node Next)
    {
        this.card_Data = Data;
        this.puzzle_Data = Word;
        this.next =  Next;
    }

    public Node(Contestant player, Card card_Data, Puzzle puzzle_data, Node prev, Node next)
    {
        this.player_Data = player;
        this.card_Data = card_Data;
        this.puzzle_Data = puzzle_Data;
        this.prev = prev;
        this.next = next;
    }

    //copy constructor
    public Node(Node node)
    {
        this.player_Data = node.player_Data;
        this.card_Data = node.card_Data;
        this.puzzle_Data = node.puzzle_Data;
        this.prev = node.prev;
        this.next = node.next;
    }



    //getters and setters
    public Contestant getPlayer_Data() {
        return player_Data;
    }


    public void setPlayer_Data(Contestant player_Data) {
        this.player_Data = player_Data;
    }


    public Card getCard_Data() {
        return card_Data;
    }


    public void setCard_Data(Card card_Data) {
        this.card_Data = card_Data;
    }


    public Puzzle getPuzzle_Data() {
        return puzzle_Data;
    }


    public void setPuzzle_Data(Puzzle puzzle_Data) {
        this.puzzle_Data = puzzle_Data;
    }


    public Node getGuess_Data() {
        return guess_Data;
    }


    public void setGuess_Data(Node guess_Data) {
        this.guess_Data = guess_Data;
    }


    public Node getPrev() {
        return prev;
    }


    public void setPrev(Node prev) {
        this.prev = prev;
    }


    public Node getNext() {
        return next;
    }


    public void setNext(Node next) {
        this.next = next;
    }


    public Object getAnswer() {
        return null;
    }

    public void display() {
    }
}


