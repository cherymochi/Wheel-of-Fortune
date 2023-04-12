package wheel_game;

// Programmer : Kyle Williams
// Date : Mar 28, 2023
// Card Class


public class Card {
    // Attributes
    private String type;
    private float value;

    // Default Constructor
    public Card(){
        type = "";
        value = 0;
    }

    // Primary Constructor
    public Card(String type, float value) {
        this.type = type;
        this.value = value;
    }

    //Copy Constructor
    public Card(Card card){
        this.type = card.type;
        this.value = card.value;
    }


    // Getters
    public String getType() {
        return type;
    }

    public float getValue() {
        return value;
    }


    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setValue(float value) {
        this.value = value;
    }


    // Other Methods
    public void display(){
        System.out.println("You landed on: " + type + "\nValued at: $" + value);
    }

}
