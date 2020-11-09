package mastermind.game;

public class Main {

    public static void main(String[] args)
    {
        Opponent opponent = new Opponent();
        opponent.makeOpponentChoice();
        opponent.runOpponentTest();

    }
}
