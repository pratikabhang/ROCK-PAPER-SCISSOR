import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, and 2 for Scissors: ");
        int user = sc.nextInt();

        Random ra = new Random();
        int comp = ra.nextInt(3);

        if (user == 0) {
            System.out.println("User choice: Rock");
        } else if (user == 1) {
            System.out.println("User choice: Paper");
        } else {
            System.out.println("User choice: Scissors");
        }

        if (comp == 0) {
            System.out.println("Computer choice: Rock");
        } else if (comp == 1) {
            System.out.println("Computer choice: Paper");
        } else {
            System.out.println("Computer choice: Scissors");
        }

        if (user == comp) {
            System.out.println("It's a draw!");
        } else if (user == 0 && comp == 2 || user == 2 && comp == 1 || user == 1 && comp == 0) {
            System.out.println("User wins!");
        } else {
            System.out.println("Computer wins!");
        }

        sc.close();
    }
}
