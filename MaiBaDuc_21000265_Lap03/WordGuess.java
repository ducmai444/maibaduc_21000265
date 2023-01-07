import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    final static String[] words = {"Apple", "Banana", "Cherry", "Durian", "Grape", "Kumquat"};


    public static void main(String[] args) {
//        String word = "testing";
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        String wordInLower = word.toLowerCase();
        boolean[] check = new boolean[word.length()];
        Scanner in = new Scanner(System.in);
        int trials = 1;
        System.out.print("Key in one character or your guess word: ");
        String guess = in.nextLine().toLowerCase();
        while (!guess.equals(wordInLower)) {
            System.out.print("Trial " + trials + ": ");
            for (int i = 0; i < word.length(); i++) {
                if (guess.length() == 1 && wordInLower.charAt(i) == guess.charAt(0)) {
                    check[i] = true;
                }
                if (check[i]) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print("_");
                }
            }

            trials++;
            System.out.print("\nKey in one character or your guess word: ");
            guess = in.nextLine().toLowerCase();
        }
        System.out.println("Congratulation!\nYou got in " + trials + (trials < 2 ? " trial" : " trials"));
    }
}
