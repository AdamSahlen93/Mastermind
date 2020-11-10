package mastermind.game;
import java.util.Scanner;

public class Menu
{
    //Attributes controlling the program/menu
    boolean runProgram = true;
    Scanner playerInput = new Scanner(System.in);

    //Switch
    public void runMenu()
    {

        System.out.println("-----Welcome to Mastermind-----\n1. Start a new game against the computer\n2. New to mastermind? - Read the rules here!\n3. Exit the program");

        int playerInputForMenu = playerInput.nextInt();
        
        switch (playerInputForMenu)
        {
            case 1:
                Opponent opponent = new Opponent();
                opponent.makeOpponentChoice();
                opponent.runOpponentTest();
                Player player = new Player();
                player.makeGuess();
                player.runPlayerTest();
                break;
            case 2:
                System.out.println("-----Rules-----");
                System.out.println("To go back - Press 0");
                int playerInputForRules = playerInput.nextInt();
                if (playerInputForRules == 0)
                {
                      runMenu();
                }
                break;
            case 3:
                System.out.println("3");
                break;
            case 99:
                runProgram = false;
            default:

        }
    }

}
