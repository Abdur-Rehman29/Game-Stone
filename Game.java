import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[] rps = {"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Name:");
        String name = scanner.nextLine();

        System.out.println(name + " Is is in the House!");
        System.out.println("Let's start!");

        while (true) {
            System.out.println("Enter move, Loser May Enter \"exit\": ");
            String userMove = scanner.nextLine();
            if (userMove.equalsIgnoreCase("exit")) {
                break;
            }
            if (!userMove.equalsIgnoreCase("Rock") &&
                    !userMove.equalsIgnoreCase("Paper") &&
                    !userMove.equalsIgnoreCase("Scissors"))
            {
                System.out.println("Invalid move, Enter Valid One!.");
                continue;
            }
            int computerMoveIndex = random.nextInt(3);
            String computerMove = rps[computerMoveIndex];
            System.out.println("Computer move: " + computerMove);
            if (userMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equalsIgnoreCase("Rock") &&
                    computerMove.equalsIgnoreCase("Scissors") ||
                    userMove.equalsIgnoreCase("Rock") &&
                            computerMove.equalsIgnoreCase("Paper") ||
                    userMove.equalsIgnoreCase("Scissors") &&
                            computerMove.equalsIgnoreCase("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
    }
}
