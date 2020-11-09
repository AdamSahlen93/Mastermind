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
        int playerInputForMenu = playerInput.nextInt();
        
        switch (playerInputForMenu)
        {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
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
