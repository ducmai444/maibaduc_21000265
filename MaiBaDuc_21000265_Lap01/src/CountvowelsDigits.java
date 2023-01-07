import java.util.Scanner;

public class CountvowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();

        int countVowels = 0;
        int countDigits = 0;
        int inStrLength = inStr.length();

        for (int i = 0; i < inStrLength; i++) {
            switch (inStr.charAt(i)){
                case 'a':
                    countVowels++;
                    break;
                case 'e':
                    countVowels++;
                    break;
                case 'i':
                    countVowels++;
                    break;
                case 'o':
                    countVowels++;
                    break;
                case 'u':
                    countVowels++;
                    break;
                case 'A':
                    countVowels++;
                    break;
                case 'E':
                    countVowels++;
                    break;
                case 'I':
                    countVowels++;
                    break;
                case 'O':
                    countVowels++;
                    break;
                case 'U':
                    countVowels++;
                    break;
                case '1':
                    countDigits++;
                    break;
                case '2':
                    countDigits++;
                    break;
                case '3':
                    countDigits++;
                    break;
                case '4':
                    countDigits++;
                    break;
                case '5':
                    countDigits++;
                    break;
                case '6':
                    countVowels++;
                    break;
                case '7':
                    countDigits++;
                    break;
                case '8':
                    countDigits++;
                    break;
                case '9':
                    countDigits++;
                    break;
                case '0':
                    countDigits++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Nuber of vowels: " + countVowels + "  (" + Math.round(100.00 * countVowels / inStrLength * 100.00) / 100.00 +"%)");
        System.out.println("Nuber of digits: " + countDigits + "  (" + Math.round(100.00 * countDigits / inStrLength * 100.00) / 100.00 +"%)");
    }
}
