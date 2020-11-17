package mastermind.game;
import java.util.Scanner;

public class GameplayLoop
{
    int roundCounter = 1;
    Scanner playerInputInGame = new Scanner(System.in);
    CompareGuess compareGuess = new CompareGuess();

    public void startGame()
    {
        Player player = new Player();
        Opponent opponent = new Opponent();
        opponent.makeOpponentChoice();

        while (compareGuess.runGameplay)
        {
            System.out.println("Round " + roundCounter);
            player.makeGuess();
            player.ContinueWithGuess();
            boolean thisRound = true;
            while (thisRound)
            {
                compareGuess.getOpponentSheetCopy().clear();
                compareGuess.getPlayerSheetCopy().clear();
                int makeThisGuess = playerInputInGame.nextInt();
                if (makeThisGuess == 1)
                {
                    for (int i = 0; i<player.getCreatedPlayerGuess().length; i++)
                    {
                        compareGuess.getOpponentSheetCopy().addLast(opponent.getOpponentChoice()[i]);
                        compareGuess.getPlayerSheetCopy().addLast(player.getCreatedPlayerGuess()[i]);
                    }
                    compareGuess.addPointsForGuess();
                    compareGuess.showPointsForGuess();
                    thisRound = false;

                } else if (makeThisGuess == 2)
                {
                    System.out.println("Ok, lets try again");
                    for (int i = 0; i < player.getCreatedPlayerGuess().length; i++)
                    {
                        player.getCreatedPlayerGuess()[i] = 0;
                    }
                    player.makeGuess();
                    player.ContinueWithGuess();
                }
                else
                {
                    System.out.println("Input error, try again!");
                    player.ContinueWithGuess();
                }
            }
                roundCounter++;
                for (int i = 0; i < player.getCreatedPlayerGuess().length; i++)
                {
                     player.getCreatedPlayerGuess()[i] = 0;
                }
                compareGuess.getPointsSheet().clear();
            }
                System.out.println("You won! It took you " + roundCounter + " rounds!");

        }

    }

