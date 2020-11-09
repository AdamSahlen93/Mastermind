package mastermind.game;
import java.util.concurrent.ThreadLocalRandom;


public class Opponent
{
    //Array which will hold the random generated pieces of the Opponent
    private int [] opponentPieces = {0,0,0,0};

    //Method to generate the opponents pieces and adds them to the Array "opponentPieces
    public void makeOpponentChoice()
    {
        for (int i = 0; i<opponentPieces.length; i++)
        {
            int randomOpponentChoice = ThreadLocalRandom.current().nextInt(1,9);
            opponentPieces[i] = randomOpponentChoice;
        }
    }

    //Getter for Array "opponentPieces"
    public int[] getOpponentPieces()
    {
        return opponentPieces;
    }



    //Test method for Opponent bugfix
    public void runOpponentTest()
    {
        for (int i :getOpponentPieces())
        {
            System.out.print(" - " + i );
        }
        System.out.print(" - ");


    }

}
