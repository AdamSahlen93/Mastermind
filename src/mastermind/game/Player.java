package mastermind.game;
import java.util.Scanner;

public class Player extends ColourPieces
{
    Scanner playerGuess = new Scanner(System.in);
    private int [] playerFinishedGuess = {0,0,0,0};
    private String [] playerColourGuess = {"", "","",""};

    //User input sets each turns guesses
    public void makeGuess()
    {
        for (int i = 0; i < playerFinishedGuess.length; i++)
        {
            int singlePieceGuess = playerGuess.nextInt();
            playerFinishedGuess[i] =
            playerColourGuess[i] = piecesPile.getValue();
        }

    }

    //Test method for Player bugfix
    public void runPlayerTest()
    {

    }

}
