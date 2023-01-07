import java.util.Scanner;

public class Hex2Bin {
    public static boolean checkHexStr(String inStr){
        boolean checkHex = true;
        if (inStr.equals("")){
            checkHex = false;
        } else {
            for (int i = 0; i < inStr.length(); i++) {
                if (!((inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9') || (inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'f'))) {
                    checkHex = false;
                    break;
                }
            }
        }
        return checkHex;
    }

    public static void reverseStr(String inStr, String[] arrStr){
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.charAt(i)) {
                case '0' -> arrStr[i] = "0000";
                case '1' -> arrStr[i] = "0001";
                case '2' -> arrStr[i] = "0010";
                case '3' -> arrStr[i] = "0011";
                case '4' -> arrStr[i] = "0100";
                case '5' -> arrStr[i] = "0101";
                case '6' -> arrStr[i] = "0110";
                case '7' -> arrStr[i] = "0111";
                case '8' -> arrStr[i] = "1000";
                case '9' -> arrStr[i] = "1001";
                case 'a' -> arrStr[i] = "1010";
                case 'b' -> arrStr[i] = "1011";
                case 'c' -> arrStr[i] = "1100";
                case 'd' -> arrStr[i] = "1101";
                case 'e' -> arrStr[i] = "1110";
                case 'f' -> arrStr[i] = "1111";
                default -> {
                }
            }
        }
    }

    public static void printArray(String[] arr){
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hexadecimal string: ");
        String inStr = sc.nextLine();
        inStr = inStr.toLowerCase();
        String[] reverseArray = new String[inStr.length()];
        if (checkHexStr(inStr)){
            reverseStr(inStr,reverseArray);
            System.out.print("The equivalent binary for hexadecimal " + inStr + " is: " );
            printArray(reverseArray);
        } else {
            System.out.println("Error: invalid Hexadecimal string: " + inStr);
        }
        sc.close();
    }
}
