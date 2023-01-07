import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Heximal string: ");
        String inStr = sc.nextLine();
        inStr = inStr.toUpperCase();
        double equivalentDecimal = 0;
        int charValue = 0;
        double exp;

        int inStrLength = inStr.length();

        if (IsHexString(inStr)){
            for (int i = 0; i < inStr.length(); i++) {

                switch (inStr.charAt(i)){
                    case '0':
                        charValue = 0;
                        break;
                    case '1':
                        charValue = 1;
                        break;
                    case '2':
                        charValue = 2;
                        break;
                    case '3':
                        charValue = 3;
                        break;
                    case '4':
                        charValue = 4;
                        break;
                    case '5':
                        charValue = 5;
                        break;
                    case '6':
                        charValue = 6;
                        break;
                    case '7':
                        charValue = 7;
                        break;
                    case '8':
                        charValue = 8;
                        break;
                    case '9':
                        charValue = 9;
                        break;
                    case 'a':
                        charValue = 10;
                        break;
                    case 'b':
                        charValue = 11;
                        break;
                    case 'c':
                        charValue = 12;
                        break;
                    case 'd':
                        charValue = 13;
                        break;
                    case 'e':
                        charValue = 14;
                        break;
                    case 'f':
                        charValue = 15;
                        break;
                    case 'A':
                        charValue = 10;
                        break;
                    case 'B':
                        charValue = 11;
                        break;
                    case 'C':
                        charValue = 12;
                        break;
                    case 'D':
                        charValue = 13;
                        break;
                    case 'E':
                        charValue = 14;
                        break;
                    case 'F':
                        charValue = 15;
                        break;
                    default:
                        break;
                }
                exp = Math.pow(16,inStrLength - i - 1);
                equivalentDecimal = equivalentDecimal + exp * charValue;

            }
        }

        if (IsHexString(inStr)){
            System.out.println("The equivalent decimal number for heximal " + inStr + " is: " + (int) equivalentDecimal);
        } else {
            System.out.println("error : invalid heximal string: " + inStr);
        }
    }
    public static boolean IsHexString(String str){
        int strLen = str.length();
        boolean isHexStr = true;
        for (int i = 0; i < strLen; i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')){
                if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'f')){
                    if (!(str.charAt(i) >= 'A' && str.charAt(i) <= 'F')){
                        isHexStr = false;
                        break;
                    }
                }
            }
        }
        return isHexStr;
    }
}
