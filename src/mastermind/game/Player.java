package mastermind.game;
import java.util.Scanner;

public class Player
{

    Scanner playerGuess = new Scanner(System.in);
    ColourPieces colourPieces = new ColourPieces();
    private int[] createdPlayerGuess = {0,0,0,0};


    public void makeGuess()
    {
        colourPieces.addToPiecesPile();
        colourPieces.fixCleanBoardList();
        colourPieces.showSortedPiecesList();
        for (int i = 0; i < createdPlayerGuess.length; i++)
        {
            String result = String.format("%s %s\t\t\t%s","Take a guess att nr",(i + 1)," | ");
            System.out.print(result);
            for (int j = 0; j<createdPlayerGuess.length; j++)
                if (createdPlayerGuess[j] == 0)
                {

                    System.out.print("-");
                    System.out.print(" | ");
                } else
                {
                    System.out.print(colourPieces.piecesPile.get(createdPlayerGuess[j]));
                    System.out.print(" | ");
                }
            System.out.println(" ");
            createdPlayerGuess[i] = playerGuess.nextInt();
        }

    }

    public void ContinueWithGuess()
    {
        System.out.print("Make this guess? 1: YES 2: NO\t |");
        for (int j = 0; j<createdPlayerGuess.length; j++)
        {
            System.out.print(colourPieces.piecesPile.get(createdPlayerGuess[j]));
            System.out.print(" | ");
        }

    }

    public int[] getCreatedPlayerGuess()
    {
        return createdPlayerGuess;
    }
}

