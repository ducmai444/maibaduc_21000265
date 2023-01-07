import java.util.Scanner;

public class DecipherCaeserCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String inStr = sc.nextLine();
        inStr = inStr.toUpperCase();
        int inStrLength = inStr.length();
        sc.close();

        System.out.print("The ciphertext string is: ");
        for (int charIndex = 0; charIndex < inStrLength; charIndex++) {
            System.out.print((char) (inStr.charAt(charIndex) - 3));
        }
    }
}
