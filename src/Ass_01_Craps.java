import java.util.Random;
import java.util.Scanner;

public class Ass_01_Craps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("You rolled: " + die1 + " + " + die2 + " = " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You crapped out. You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");
            } else {
