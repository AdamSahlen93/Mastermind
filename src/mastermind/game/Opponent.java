package mastermind.game;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;


public class Opponent
{
    //Array which will hold the random generated pieces of the Opponent
    private int [] opponentChoice = new int [4];

    ColourPieces colourPieces = new ColourPieces();

    //Method to generate the opponents pieces and adds them to the Array "opponentPieces
    public void makeOpponentChoice()
    {
        colourPieces.addToPiecesPile();
        for (int i = 0; i<opponentChoice.length; i++)
        {
            int randomOpponentChoice = ThreadLocalRandom.current().nextInt(1,colourPieces.piecesPile.size()+1);
            opponentChoice[i] = randomOpponentChoice;
        }
    }

    public void testForOpponentChoice()
    {

        System.out.println("Opponent:");
        for (int i = 0; i < opponentChoice.length; i++)
        {
            System.out.print(colourPieces.piecesPile.get(opponentChoice[i]));
            System.out.print(" | ");
        }
        System.out.println("\n");
    }

    public int[] getOpponentChoice()
    {

        return opponentChoice;
    }
}
