package wheel_game;

// Programmer : Kyle Williams
// Editor: Nathalea Evans
// Date : Mar 28, 2023
// Contestant Class

public class Contestant {
    // Attributes
    private int player_num;
    private String playerName;
    private float grandTotal;

    // Default Constructor
    public Contestant(){
        this.player_num = 0;
        this.grandTotal = (float) 0.0;
        this.playerName = "";

    }

    // Primary Constructor
    public Contestant(int p_num, int g_total, String name){
        this.player_num = p_num;
        this.grandTotal = g_total;
        this.playerName = name;
    }

    // Copy Constructor
    public Contestant(Contestant con){
        this.player_num = con.player_num;
        this.grandTotal = con.grandTotal;
        this.playerName = con.playerName;
    }

    // Getters
    public String getPlayerName(){
        return playerName;
    }
    public int getPlayerNum(){
        return player_num;
    }

    public float getGrandTotal(){
        return grandTotal;
    }

    // Setters
    public void setPlayerName(String player_name) {
        this.playerName = player_name;
    }

    public void setPlayerNum(int player_num) {
        this.player_num = player_num;
    }

    public void setGrandTotal(float grand_total) {
        this.grandTotal = grand_total;
    }

    // Other Methods
    @Override
    public String toString() { // Converts to string
        return "Contestant{" +
                "player_name='" + playerName + '\'' +
                ", player_num=" + player_num +
                ", grand_total=" + grandTotal +
                '}';
    }

    public void Display(){ // Display attributes
        System.out.println("\n\t\t\t" + toString());
    }

    // Solution Methods to Project
    public void addContestantToCircularList(int playerNumber, String playerName, float grandTotal){
        ContestantCircularNode newNode = new ContestantCircularNode();

    }

}
