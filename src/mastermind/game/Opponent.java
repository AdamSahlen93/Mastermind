package mastermind.game;
import java.util.concurrent.ThreadLocalRandom;


public class Opponent
{
    private int [] opponentChoice = new int [4];
    ColourPieces colourPieces = new ColourPieces();


    public void makeOpponentChoice()
    {
        colourPieces.addToPiecesPile();
        for (int i = 0; i<opponentChoice.length; i++)
        {
            int randomOpponentChoice = ThreadLocalRandom.current().nextInt(1,colourPieces.piecesPile.size()+1);
            opponentChoice[i] = randomOpponentChoice;
        }
    }

    public int[] getOpponentChoice()
    {
        return opponentChoice;
    }
}
