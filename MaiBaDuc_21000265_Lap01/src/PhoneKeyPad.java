import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();


        int inStrLength = inStr.length();

        for (int i = 0; i < inStrLength; i++) {
            switch (inStr.charAt(i)){
                case 'a':
                    System.out.print("2");
                    break;
                case 'b':
                    System.out.print("2");
                    break;
                case 'c':
                    System.out.print("2");
                    break;
                case 'd':
                    System.out.print("3");
                    break;
                case 'e':
                    System.out.print("3");
                    break;
                case 'f':
                    System.out.print("3");
                    break;
                case 'g':
                    System.out.print("4");
                    break;
                case 'h':
                    System.out.print("4");
                    break;
                case 'i':
                    System.out.print("4");
                    break;
                case 'j':
                    System.out.print("5");
                    break;
                case 'k':
                    System.out.print("5");
                    break;
                case 'l':
                    System.out.print("5");
                    break;
                case 'm':
                    System.out.print("6");
                    break;
                case 'n':
                    System.out.print("6");
                    break;
                case 'o':
                    System.out.print("6");
                    break;
                case 'p':
                    System.out.print("7");
                    break;
                case 'q':
                    System.out.print("7");
                    break;
                case 'r':
                    System.out.print("7");
                    break;
                case 's':
                    System.out.print("7");
                    break;
                case 't':
                    System.out.print("8");
                    break;
                case 'u':
                    System.out.print("8");
                    break;
                case 'v':
                    System.out.print("8");
                    break;
                case 'w':
                    System.out.print("9");
                    break;
                case 'x':
                    System.out.print("9");
                    break;
                case 'y':
                    System.out.print("9");
                    break;
                case 'z':
                    System.out.print("9");
                    break;
                case 'A':
                    System.out.print("2");
                    break;
                case 'B':
                    System.out.print("2");
                    break;
                case 'C':
                    System.out.print("2");
                    break;
                case 'D':
                    System.out.print("3");
                    break;
                case 'E':
                    System.out.print("3");
                    break;
                case 'F':
                    System.out.print("3");
                    break;
                case 'G':
                    System.out.print("4");
                    break;
                case 'H':
                    System.out.print("4");
                    break;
                case 'I':
                    System.out.print("4");
                    break;
                case 'J':
                    System.out.print("5");
                    break;
                case 'K':
                    System.out.print("5");
                    break;
                case 'L':
                    System.out.print("5");
                    break;
                case 'M':
                    System.out.print("6");
                    break;
                case 'N':
                    System.out.print("6");
                    break;
                case 'O':
                    System.out.print("6");
                    break;
                case 'P':
                    System.out.print("7");
                    break;
                case 'Q':
                    System.out.print("7");
                    break;
                case 'R':
                    System.out.print("7");
                    break;
                case 'S':
                    System.out.print("7");
                    break;
                case 'T':
                    System.out.print("8");
                    break;
                case 'U':
                    System.out.print("8");
                    break;
                case 'V':
                    System.out.print("8");
                    break;
                case 'W':
                    System.out.print("9");
                    break;
                case 'X':
                    System.out.print("9");
                    break;
                case 'Y':
                    System.out.print("9");
                    break;
                case 'Z':
                    System.out.print("9");
                    break;
                default:
                    break;
            }
        }
    }
}
