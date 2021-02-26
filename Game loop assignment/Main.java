import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to rock paper scissors");
        //the rules of rock paper scissors
        //rock crushes scissors, paper covers rock, and scissors cuts paper
        //make you own choices of rock, paper,or scissors
        //computer also makes its choices
        //the final result will be compare

        //set up the starting point of the game
        int wins = 0;
        int loss = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your move: Rock, Paper, or Scissors");
            System.out.println("'quit' to quit the game");

            System.out.println("..........................................");
            System.out.println("Score: " + "Wins: " + wins + "  " + "Loses: " + loss);
            System.out.println("..........................................");
            String move = scanner.next();
            System.out.println("Your move is: " + move);

            //Check if the user wants to quit the game
            if (move.equals("quit")) {
                break;
            }

            //Users can only enter "Rock", "Paper", or " Scissors"
            //Otherwise, the move isn't valid
            //Check if the users' move is valid
            if (!move.equals("Rock") && !move.equals("Paper") && !move.equals("Scissors")) {
                System.out.println("Your move isn't valid");
                System.out.println("Make a valid move");
            } else {

                //random integer between 1 and 3
                int random = (int) ((Math.random() * 3) + 1);
                String computerMove = "";

                //Display the random move by computer
                if (random == 1) {
                    computerMove = "Rock";
                }
                if (random == 2) {
                    computerMove = "Paper";
                }
                if (random == 3) {
                    computerMove = "Scissors";
                }
                System.out.println("computer's move is " + computerMove);

                //Compared users' move and computer's move
                //Display the results of the game : draw, win, or lose.
                if (computerMove.equals(move)) {
                    System.out.println("This was a draw");

                } else if (computerMove.equals("Rock") && move.equals("Scissors") ||
                        computerMove.equals("Scissors") && move.equals("Paper") ||
                        computerMove.equals("Paper") && move.equals("Rock")) {
                    System.out.println("You lost");
                    System.out.println("Better luck next time");
                    loss++;

                } else {
                    System.out.println("You won");
                    System.out.println("Congratulations");
                    wins++;
                }
            }

        }
    }
}


