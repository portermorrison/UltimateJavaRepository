package Unit03.Topic3_5;

public class SpinnerGame {
    
    public int spin(int min, int max) {
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        return randomNumber;
    }

    public int playRound() {
        int playerScore = spin(1,10);
        int computerScore = spin(2,8);

        if (playerScore > computerScore) {
            int points = (int) Math.abs(playerScore - computerScore);
            String win = "YOU WIN!" + points + " points";
            System.out.println(win);
        } else if (playerScore < computerScore) {
            int points =  (playerScore - computerScore);
            String lose = "YOU LOSE" + points;
            System.out.println(lose);
        } else {
            playerScore = spin(1,10);
            computerScore = spin(2,8);
    
            if (playerScore > computerScore) {
                String win = "YOU WIN" + 1;
                System.out.println(win);
            } else if (playerScore < computerScore) {
                String lose = "YOU LOSE" + -1;
                System.out.println(lose);
            } else {
                System.out.println("tied game");
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        SpinnerGame g1 = new SpinnerGame();
        g1.playRound();

    }

}
