package mastermind.game;
import java.util.Scanner;

public class OLDGameSystem extends Opponent
{
    Scanner playerGameInput = new Scanner(System.in);
    boolean runGamePlay = true;
    int roundCounter = 1;

    public void startGame()
    {
        makeOpponentChoice();
        runOpponentTest();
        OLDPoints points = new OLDPoints();
        points.setOpponentSheetCopy(getOpponentPieces());
        OLDPlayer player = new OLDPlayer();
        while (runGamePlay)
        {
            System.out.println("Round " + roundCounter);
            player.makeGuess();
            if (player.getPlayerFinishedGuess().equals(getOpponentPieces()))
            {
                System.out.println("YOU WON!");
                player.getPlayerFinishedGuess().clear();
                player.getPlayerColourGuess().clear();
                runGamePlay = false;
                break;
            }
            player.playerContinueWithGuess();
            int playerGuessOrNot = playerGameInput.nextInt();
            if (playerGuessOrNot == 1)
            {
                points.setPlayerSheetCopy(player.getPlayerFinishedGuess());
                System.out.println("Your guess " + player.getPlayerColourGuess().toString() + " gives following result: ");
                points.showPointsForGuess();
                roundCounter++;
                System.out.println("\n");
                player.getPlayerFinishedGuess().clear();
                player.getPlayerColourGuess().clear();
                points.getPlayerSheetCopy().clear();

            } else if (playerGuessOrNot == 2)
            {
                player.getPlayerFinishedGuess().clear();
                player.getPlayerColourGuess().clear();
                System.out.println("Ok, lets try that again!\n");
            } else
            {
                player.getPlayerFinishedGuess().clear();
                player.getPlayerColourGuess().clear();
                System.out.println("Something went wrong, restarting current round!");
            }
        }
    }
}
