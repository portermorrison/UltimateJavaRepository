package Unit02.Topic2_3;

public class Game
{
    // instance variables
    private int numPlayers;
    private boolean gameOver;

    // constructor
    public Game() {
        numPlayers = 1;
        gameOver = false;
    }

    // instance methods
    public void addPlayer() {
        numPlayers++;
    }

    public void endGame()
    {
        gameOver = true;
    }

    public static void main(String[] args) {
        
    }
}
