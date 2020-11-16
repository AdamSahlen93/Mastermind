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
                System.out.println("Starting Game!");
            case 2:
                boolean showMastermindRules = true;

                while (showMastermindRules)
                {
                    rules.runRules();
                    System.out.println("\nTo go back - type EXIT");
                    String handleRulesMenu = playerMenuInput.nextLine();
                    try
                    {
                        if (handleRulesMenu.equals("Exit") || handleRulesMenu.equals("EXIT") || handleRulesMenu.equals("exit"))
                        {
                            showMastermindRules = false;
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("Something went wrong, please try again!");
                    }
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
