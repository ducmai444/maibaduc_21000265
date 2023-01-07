import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();
        int inStrLength = inStr.length();

        System.out.print("The reverse of the " + inStr + " is: ");
        for (int charIndex = inStrLength - 1; charIndex >=  0; charIndex--) {
            System.out.print(inStr.charAt(charIndex));
        }

    }
}
