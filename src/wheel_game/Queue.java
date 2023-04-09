package wheel_game;

// Programmer : Lamar Smith
// Date : Mar 28, 2023
// Queue Class


public class Queue {

    private Node front;
    private Node rear;


    //default constructor
    public Queue()
    {
        front = null;
        rear = null;
    }



    //getters and setters
    public Node getFront() {
        return front;
    }


    public void setFront(Node front) {
        this.front = front;
    }


    public Node getRear() {
        return rear;
    }


    public void setRear(Node rear) {
        this.rear = rear;
    }

    //EnQueue method to add guessed letters to queue
    public boolean EnQueue(Node answer)
    {
        if(IsFull())
        {
            System.out.println("List is full");
            return false;
        }
        else
        {
            Node nextElement = new Node();
            nextElement.setGuess_Data(answer);

            if(IsEmpty())
            {
                front = nextElement;
                rear = nextElement;
            }
            else
            {
                nextElement.setPrev(rear);
                rear.setNext(nextElement);
                rear = nextElement;
            }
            return true;
        }
    }//end of EnQueue class



    private boolean IsEmpty() {

        if(front == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }//end of IsEmpty class



    @SuppressWarnings("unused")
    private boolean IsFull() {

        Node temp = new Node();
        if(temp == null)
        {
            return true;
        }
        else
        {
            temp = null;
            return false;
        }
    }//end of IsFull class



    //DeQueue class to remove guessed letters
    public Node DeQueue()
    {
        Node temp = front;
        Node data = temp;

        if(IsEmpty())
        {
            System.err.println("The Queue is empty, nothing to remove");
        }
        else
        {
            if(front == rear)
            {
                front = null;
                rear = null;
            }
            else
            {
                front = front.getNext();
                front.setPrev(null);
                temp = null;
            }
        }
        return data.getGuess_Data();

    }//end of DeQueue class



    //to search for a letter that has already been guessed
    public boolean search(String letter)
    {
        if(!IsEmpty())
        {
            Queue temp = new Queue();//create temp Queue
            Node curr;
            boolean found = false;

            while(front != null)
            {
                curr = DeQueue();
                if(curr.getAnswer().equals(letter))
                {
                    found = true;
                }
                temp.EnQueue(curr);//remove from original and adds to temp Queue
            }
            while(temp.front !=null)
            {
                EnQueue(temp.DeQueue()); //removes from original and adds back to original Queue
            }
            if(found)
                return true;
        }
        return false;
    }//end of search class



    //to display the letters guessed
    public void display(String letterType)
    {
        if(!IsEmpty())
        {
            Queue temp = new Queue(); //creates temp Queue
            Node curr;

            while(front != null)
            {
                curr = DeQueue();

                if(letterType.equals("Vowels"))
                {
                    if(curr.getAnswer().equals("A") | curr.getAnswer().equals("E") | curr.getAnswer().equals("I") | curr.getAnswer().equals("O") | curr.getAnswer().equals("U")) {
                        curr.display();
                    }

                }else if(letterType.equals("Regular letter"))
                {
                    if(!(curr.getAnswer().equals("A") | curr.getAnswer().equals("E") | curr.getAnswer().equals("I") | curr.getAnswer().equals("O") | curr.getAnswer().equals("U"))) {
                        curr.display();
                    }


                }
                temp.EnQueue(curr); //removes from original and adds to temp Queue

            }
            while(temp.front != null)
            {
                EnQueue(temp.DeQueue()); //removes from temp Queue and adds to original Queue
            }
        }
    }//end of display class



    public void delete()
    {
        if(!IsEmpty())
        {
            Node delete = front;
            front = delete.getNext();
            delete = null;
        }
    }//end of delete class


    public void destroyQueue() //destroy answer linked list
    {
        if(IsEmpty())
        {
            return;
        }
        else
        {
            DeQueue();
            destroyQueue();
        }
    }

}







