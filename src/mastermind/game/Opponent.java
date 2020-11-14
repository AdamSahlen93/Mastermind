package mastermind.game;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Opponent
{
    //Array which will hold the random generated pieces of the Opponent
    private LinkedList<Integer> opponentPieces = new LinkedList<>();

    //Method to generate the opponents pieces and adds them to the Array "opponentPieces
    public void makeOpponentChoice()
    {
        for (int i = 0; i<4; i++)
        {
            int randomOpponentChoice = ThreadLocalRandom.current().nextInt(1,9);
            opponentPieces.add(randomOpponentChoice);
        }
    }

    //Getter for Array "opponentPieces"
    public LinkedList<Integer> getOpponentPieces()
    {
        return opponentPieces;
    }

    //Test method for Opponent bugfix
    public void runOpponentTest()
    {
        System.out.println(opponentPieces.toString());
    }

}
