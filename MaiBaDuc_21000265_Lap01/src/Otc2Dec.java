import java.util.Scanner;

public class Otc2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Otcal string: ");
        String inStr = sc.nextLine();
        inStr = inStr.toUpperCase();
        double equivalentDecimal = 0;
        int charValue = 1;
        double exp;

        int inStrLength = inStr.length();

        if (IsOtcString(inStr)){
            for (int i = 0; i < inStr.length(); i++) {
                switch (inStr.charAt(i)) {
                    case '0' -> charValue = 0;
                    case '1' -> charValue = 1;
                    case '2' -> charValue = 2;
                    case '3' -> charValue = 3;
                    case '4' -> charValue = 4;
                    case '5' -> charValue = 5;
                    case '6' -> charValue = 6;
                    case '7' -> charValue = 7;
                    default -> {
                    }
                }
                exp = Math.pow(8,inStrLength - i - 1);
                equivalentDecimal = equivalentDecimal + exp * charValue;

            }
        }

        if (IsOtcString(inStr)){
            System.out.println("The equivalent decimal number for Otcal " + inStr + " is: " + (int) equivalentDecimal);
        } else {
            System.out.println("error : invalid Otcal string: " + inStr);
        }
    }
    public static boolean IsOtcString(String str){
        int strLen = str.length();
        boolean isHexStr = true;
        for (int i = 0; i < strLen; i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '7')){
                isHexStr = false;
                break;
            }
        }
        return isHexStr;
    }
}
