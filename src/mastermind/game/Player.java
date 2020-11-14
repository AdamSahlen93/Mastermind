package mastermind.game;
import java.util.LinkedList;
import java.util.Scanner;

public class Player extends ColourPieces
{
    Scanner playerGuess = new Scanner(System.in);
    private LinkedList<Integer> playerFinishedGuess = new LinkedList<>();
    private LinkedList<String> playerColourGuess = new LinkedList<>();

    //User input sets each turns guesses
    public void makeGuess()
    {
        addToPiecesPile();
        showSortedPiecesList();
        for (int i = 0; i <4; i++)
        {
            if (i == 0)
            {
                System.out.println("\n- - - -");
                System.out.print("Take a guess at nr " + (i + 1) + ": ");
                int singlePieceGuess = playerGuess.nextInt();
                playerFinishedGuess.add(singlePieceGuess);
                playerColourGuess.add(piecesPile.get(singlePieceGuess));
            }
            else
            {
                System.out.println("\n" + playerColourGuess.toString());
                System.out.print("Take a guess at nr " + (i + 1) + ": ");
                int singlePieceGuess = playerGuess.nextInt();
                playerFinishedGuess.add(singlePieceGuess);
                playerColourGuess.add(piecesPile.get(singlePieceGuess));
            }
        }
    }


    public void playerContinueWithGuess()
    {

        System.out.println("\n" + playerColourGuess.toString());
        System.out.println("Are you sure this is your next guess? | 1: YES | 2: NO |");
        sortedPiecesList.clear();
        System.out.println("\n");
    }


    public LinkedList<String> getPlayerColourGuess()
    {

        return playerColourGuess;
    }

    public void setPlayerColourGuess(LinkedList<String> playerColourGuess)
    {

        this.playerColourGuess = playerColourGuess;
    }

    public LinkedList<Integer> getPlayerFinishedGuess()
    {

        return playerFinishedGuess;
    }

    public void setPlayerFinishedGuess(LinkedList<Integer> playerFinishedGuess)
    {

        this.playerFinishedGuess = playerFinishedGuess;
    }
}
