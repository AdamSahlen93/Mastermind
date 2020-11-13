package mastermind.game;
import java.util.Arrays;
import java.util.Scanner;

public class GameSystem extends Opponent
{
    Scanner playerGameInput = new Scanner(System.in);
    boolean runGamePlay = true;
    int roundCounter = 1;

    public void startGame()
    {
        makeOpponentChoice();
        runOpponentTest();
        Points points = new Points();
        Player player = new Player();
        while (runGamePlay)
        {
            System.out.println("Round " + roundCounter);
            player.makeGuess();
            player.runFinishedGuessTest();
            if (Arrays.equals(player.getPlayerFinishedGuess(), getOpponentPieces()))
            {
                System.out.println("YOU WON!");
                runGamePlay = false;
                break;
            }
            player.playerContinueWithGuess();
            int playerGuessOrNot = playerGameInput.nextInt();
            if (playerGuessOrNot == 1)
            {
                System.out.println("Your guess " + Arrays.toString(player.getPlayerColourGuess()) + " gives following result: ");
                roundCounter++;
            } else if (playerGuessOrNot == 2)
            {
                System.out.println("Ok, lets try that again!");
            } else
            {
                System.out.println("Something went wrong, restarting current round!");
            }
        }
    }
}
