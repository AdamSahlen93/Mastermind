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
        addToPiecesPile();
        showSortedPiecesList();
        for (int i = 0; i < playerFinishedGuess.length; i++)
        {
            if (i == 0)
            {
                System.out.println("\n- - - -");
                System.out.print("Take a guess at nr " + (i + 1) + ": ");
                int singlePieceGuess = playerGuess.nextInt();
                playerFinishedGuess[i] = singlePieceGuess;
                playerColourGuess[i] = piecesPile.get(singlePieceGuess);
            }
            else
            {
                System.out.println("\n" + playerColourGuess[0] + " - " + playerColourGuess[1] + " - " + playerColourGuess[2] + " - " + playerColourGuess[3]);
                System.out.print("Take a guess at nr " + (i + 1) + ": ");
                int singlePieceGuess = playerGuess.nextInt();
                playerFinishedGuess[i] = singlePieceGuess;
                playerColourGuess[i] = piecesPile.get(singlePieceGuess);
            }
        }
    }

    //Test method for Player bugfix
    public void runPlayerTest()
    {
        System.out.println("\nAre you sure this is your next guess? | 1: YES | 2: NO |");
        for (String showPlayerColourGuesses : playerColourGuess)
        {
            System.out.print(showPlayerColourGuesses + " | ");
        }
        System.out.println("\n");
    }


}
