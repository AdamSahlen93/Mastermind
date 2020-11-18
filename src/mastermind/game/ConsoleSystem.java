package mastermind.game;

public abstract class ConsoleSystem
{
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
