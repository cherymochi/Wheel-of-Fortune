package wheel_game;

// Programmer : Kyle Williams
// Editor: Nathalea Evans
// Date : Mar 28, 2023
// Contestant Class

public class Contestant {
    // Attributes
    private int playerNumber;
    private String playerName;
    private float roundTotal;
    private float grandTotal;

    // Default Constructor
    public Contestant(){
        this.playerNumber = 0;
        roundTotal = 0;
        this.grandTotal = (float) 0.0;
        this.playerName = "";

    }

    // Primary Constructor
    public Contestant(int p_num, int g_total, String name, float roundTotal){
        this.playerNumber = p_num;
        this.grandTotal = g_total;
        this.playerName = name;
        this.roundTotal = roundTotal;
    }

    // Copy Constructor
    public Contestant(Contestant con){
        this.playerNumber = con.playerNumber;
        this.grandTotal = con.grandTotal;
        this.playerName = con.playerName;
        this.roundTotal = con.roundTotal;
    }

    // Getters
    public String getPlayerName(){
        return playerName;
    }
    public int getPlayerNum(){
        return playerNumber;
    }

    public float getGrandTotal(){
        return grandTotal;
    }

    public float getRoundTotal() {
        return roundTotal;
    }

    // Setters
    public void setPlayerName(String player_name) {
        this.playerName = player_name;
    }

    public void setPlayerNum(int player_num) {
        this.playerNumber = playerNumber;
    }

    public void setGrandTotal(float grand_total) {
        this.grandTotal = grand_total;
    }

    public void setRoundTotal(float roundTotal) {
        this.roundTotal = roundTotal;
    }

    // Other Methods
    @Override
    public String toString() { // Converts to string
        return "Contestant{" +
                "player_name='" + playerName + '\'' +
                ", player_num=" + playerNumber +
                ", grand_total=" + grandTotal +
                '}';
    }

    public void Display(){ // Display attributes
        System.out.println("\n\t\t\t" + toString());
    }

}
