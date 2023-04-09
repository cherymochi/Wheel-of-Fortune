package wheel_game;

// Programmer : Kyle Williams
// Date : Mar 28, 2023
// Node Class


public class Guess {

    private String answer;


    //default constructor
    public Guess()
    {
        answer = " ";
    }

    //primary constructor
    public Guess(String answer)
    {
        this.answer = answer;
    }

    //copy constructor
    public Guess(Guess gs)
    {
        this.answer = gs.answer;
    }



    //getters and setters
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void display()
    {
        System.out.println(answer);
    }



}
