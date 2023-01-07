import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inStr = sc.nextLine();
        int result = 1;
        int charValue;

        /*for (int i = 0; i < inStr.length(); i++) {
            charValue = Integer.parseInt(String.valueOf(inStr.charAt(i)));
            result = result * charValue;
        }*/
        result = (int) 'F';
        System.out.println(result);
    }
}
