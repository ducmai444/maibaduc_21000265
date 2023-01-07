import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(99);
        Scanner in = new Scanner(System.in);
        System.out.println("Key in your guess:");
        int guess = in.nextInt();
        int trials = 1;
        while (guess != number) {
            if (guess < number) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
            guess = in.nextInt();
            trials++;
        }
        System.out.println("You got in in " + trials + " trials!");
    }
}
