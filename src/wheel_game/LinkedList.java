package wheel_game;

// Programmer : Lamar Smith
// Date : Mar 28, 2023
// Linked List Class



public class LinkedList {

    private Node head;
    private Node tail;

    //default constructor
    public LinkedList()//create empty list
    {
        head = null;
        tail = null;
    }

    //to check if list is empty
    public boolean IsEmpty()
    {
        if(head == null)//if the head is empty
        {
            return true;
        }
        else
        {
            return false;
        }
    }//end of IsEmpty method



    //to check if list is full
    public boolean IsFull()
    {
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
    }//end of IsFull Method

    //create a linked list for both player and card
    public boolean circlyList(Card obj, Contestant player)
    {

        if(IsFull())
        {
            System.out.println("The list is full");
            return false;
        }
        else
        {
            Node nextValue = new Node();

            if(player ==  null)
                nextValue.setCard_Data(obj);
            else
                nextValue.setPlayer_Data(player);

            if(head == null)
            {
                head = nextValue;
            }
            else
            {
                tail.setNext(nextValue);
            }
            tail = nextValue;
            tail.setNext(head);
            return true;

        }
    }//end of CirclyList method


    //adds puzzle to the front of the list
    public boolean addPuzzleToFront(Puzzle pobj)
    {
        if(IsFull()) {//checks if the list is full
            System.out.println("The list is full");
            return false;
        }
        else
        {
            Node nextValue = new Node(pobj);

            if(IsEmpty())//if list is empty adds data to it
            {
                head = nextValue;
                tail = nextValue;
            }
            else
            {
                tail.setNext(nextValue);
                nextValue.setPrev(tail);
                tail = nextValue;
            }
            tail.setNext(head);
            head.setPrev(tail);
            return true;
        }
    }//end of addPuzzleToFront method


    //selects a puzzle at random and removes the selected puzzle from the list
    public Node selectRandom(int sIndex, int totalPuzzle)
    {
        System.out.println("Total Puzzles:     " + totalPuzzle + "\nPuzzle selected at random:   " +(sIndex+1));
        int index = 0;
        int mIndex = (totalPuzzle/2); //divides the amount of puzzles by 2
        boolean greater = false;
        Node current = head;

        if(sIndex > mIndex)
        {
            greater = true;
            current = tail;

            sIndex = totalPuzzle - (sIndex+2); //initialize the selected index to the value of(total puzzle - index of the selected puzzle)
        }
        System.out.println("Middle Index ( " + totalPuzzle +"/2)    : "+mIndex);

        if(head == tail)
        {
            head = null;
            tail = null;
        }
        else
        {
            int count = 0;

            while(index <=sIndex)
            {
                if(!greater)
                {
                    if(index > 0)
                    {
                        current = current.getNext();
                        count++;
                    }
                }
                else
                {
                    count++;
                    current = current.getPrev();
                }
                count++;
            }
            System.out.println("Step(s) needed to find puzzle: " +(count));

            Node temp = current;
            temp.getNext().setPrev(temp.getPrev());
            temp.getPrev().setNext(temp.getNext());
            current = null;
            return temp;
        }
        return current;

    }//end of selectRandom


    public Node selection(int search)
    {
        Node current = head;
        int index = 0;

        while(!IsEmpty())
        {
            if(index == search)
            {
                current.getCard_Data();
                return current;
            }
            current = current.getNext();
            index++;
        }
        return null;
    }//end of Selection



    //method selects players and cards
    public Node nodeSelection()
    {
        Node current = head;
        Node Data = new Node();

        if(!IsEmpty())
        {
            Data = current;
            head = current.getNext();
        }
        else
        {
            System.err.println("List is empty, cannot make a selection");
        }
        return Data;

    }//end of NodeSelection


    //method that resets the total after each round
    public void resetRoundTotal(int numOfPlayer)
    {
        if(!IsEmpty())
        {
            Node current = head;

            for(int x = 0; x <numOfPlayer; x++)
            {
                if(current.getPlayer_Data().getRoundTotal() > 0)
                {
                    current.getPlayer_Data().setRoundTotal(0);
                }current = current.getNext();
            }
        }
    }//end of resetRoundTotal



    public void delete()
    {
        if(!IsEmpty())
        {
            Node delete = head;
            head = delete.getNext();
            delete = null;
        }
    }//end of delete method



    public void destroy()
    {
        if(!IsEmpty())
        {
            return;
        }
        else
        {
            delete();
            destroy();
        }
    }//end of class


}
