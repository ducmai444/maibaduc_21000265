import java.util.Scanner;

public class TestPalindromicPharse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String testStr = "";
        sc.close();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                testStr = testStr + str.charAt(i);
            }
        }

        if (TestPalindromicWord(testStr)){
            System.out.println(str + " is a Palindromic pharse");
        } else {
            System.out.println(str + " is not a Palindromic pharse");
        }
    }

    public static boolean TestPalindromicWord(String str){
        str = str.toUpperCase();
        String backwardStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            backwardStr = backwardStr + str.charAt(i);
        }
        if (str.equals(backwardStr)) {
            return true;
        } else {
            return false;
        }
    }
}
