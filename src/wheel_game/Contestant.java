package wheel_game;

// Programmer : Kyle Williams
// Date : Mar 28, 2023
// Contestant Class

public class Contestant {
    // Attributes
    private String player_name;
    private int player_num;
    private float grand_total;
    private float round_total;

    int wins;


    // Default Constructor
    public Contestant(){
        this.player_num = 0;
        this.grand_total = (float) 0.0;
        this.round_total = (float) 0.0;
        this.player_name = "";

    }

    // Primary Constructor
    public Contestant(int p_num, int g_total, int r_total, String name){
        this.player_num = p_num;
        this.grand_total = g_total;
        this.round_total = r_total;
        this.player_name = name;
    }

    // Copy Constructor
    public Contestant(Contestant con){
        this.player_num = con.player_num;
        this.grand_total = con.grand_total;
        this.round_total = con.round_total;
        this.player_name = con.player_name;
    }

    // Getters
    public String getPlayerName(){
        return player_name;
    }
    public int getPlayerNum(){
        return player_num;
    }

    public float getGrandTotal(){
        return grand_total;
    }

    public float getRoundTotal(){
        return round_total;
    }

    public int getWins(){
        return  wins;
    }


    // Setters
    public void setPlayerName(String player_name) {
        this.player_name = player_name;
    }

    public void setPlayerNum(int player_num) {
        this.player_num = player_num;
    }

    public void setGrandTotal(float grand_total) {
        this.grand_total = grand_total;
    }

    public void setRound_total(float round_total) {
        this.round_total = round_total;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    // Other Methods
    @Override
    public String toString() { // Converts to string
        return "Contestant{" +
                "player_name='" + player_name + '\'' +
                ", player_num=" + player_num +
                ", grand_total=" + grand_total +
                ", round_total=" + round_total +
                '}';
    }

    public void Display(){ // Display attributes
        System.out.println("\n\t\t\t" + toString());
    }
}
