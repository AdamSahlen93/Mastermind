package mastermind.game;
import java.util.Scanner;

public class GameSystem
{

    public static void main(String[] args)
    {

        boolean runProgram = true;
        while (runProgram)
        {

                GameplayLoop gameplayLoop = new GameplayLoop();
                Rules rules = new Rules();

                Scanner playerMenuInput = new Scanner(System.in);
                System.out.println("\n-----Welcome to Mastermind-----\n1. Start a new game against the computer\n2. New to mastermind? - Read the rules here!\n3. Exit the program");
                int playerInputForMenu = playerMenuInput.nextInt();
                switch (playerInputForMenu)
                    {
                        case 1:
                            gameplayLoop.startGame();
                            break;
                        case 2:
                            while (rules.giveInfoToGameSystem)
                            {
                                rules.showTheRules();
                                rules.handleTheRules();
                            }
                            break;
                        case 3:
                            runProgram = false;
                            break;
                        default:
                            System.out.println("Something went wrong, please try again!");
                    }

        }
    }

}

