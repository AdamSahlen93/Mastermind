package mastermind.game;
import java.util.Arrays;
import java.util.Scanner;

public class Menu
{

    public static void main(String[] args)
    {

    //Attributes controlling the program/menu
    boolean runProgram = true;

    while (runProgram)
    {
        Scanner playerMenuInput = new Scanner(System.in);
        System.out.println("-----Welcome to Mastermind-----\n1. Start a new game against the computer\n2. New to mastermind? - Read the rules here!\n3. Exit the program");
        int playerInputForMenu = playerMenuInput.nextInt();

        switch (playerInputForMenu)
        {
            case 1:
                GameSystem gamesystem = new GameSystem();
                gamesystem.startGame();
            break;
                case 2:
                    Rules rules = new Rules();
                    rules.runRules();
                    System.out.println("To go back - Press 0");
                    int playerRulesNavigator = playerMenuInput.nextInt();
                    if (playerRulesNavigator == 0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Input error, returning to Main Menu");
                    }
                    break;
                     case 3:
                        runProgram = false;
                        break;
                default:
                    System.out.println("Input error, please try again!");
            }
        }
    }

}
