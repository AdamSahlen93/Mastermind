package mastermind.game;
import java.util.LinkedList;
import java.util.Scanner;

public class OLDPlayer extends ColourPieces
{

    Scanner playerGuess = new Scanner(System.in);
    ColourPieces colourPieces = new ColourPieces();
    private int[] createdPlayerGuess = new int[4];

    //private LinkedList<Integer> playerFinishedGuess = new LinkedList<>();
    //private LinkedList<String> playerColourGuess = new LinkedList<>();

    public void makeGuess()
    {

        colourPieces.addToPiecesPile();
        showSortedPiecesList();
        for (int i = 0; i < createdPlayerGuess.length; i++)
        {
            for (int j = 0; j < createdPlayerGuess.length; j++)
            {
                if (createdPlayerGuess[j] >= 1 || createdPlayerGuess[j] <= 8)
                {
                    System.out.println(colourPieces.piecesPile.get(j));
                } else
                {
                    System.out.println("-");
                }
                System.out.println("Take a guess att nr " + (i + 1) + ": ");
                createdPlayerGuess[i] = playerGuess.nextInt();
            }
        }
    }


    public void playerContinueWithGuess()
    {

        System.out.println("\n" + createdPlayerGuess.toString());
        System.out.println("Are you sure this is your next guess? | 1: YES | 2: NO |");
        System.out.println("\n");
    }
}

