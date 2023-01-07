import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radix : ");
        int radix = Integer.parseInt(sc.nextLine());

        if (radix >= 0 && radix <= 16){
            System.out.print("Enter the string : ");
            String inStr = sc.nextLine();
            inStr = inStr.toUpperCase();
            double equivalentDecimal = 0;
            int charValue = 0;
            int checkStr = 0;
            double exp;
            int inStrLength = inStr.length();

            for (int i = 0; i < inStr.length(); i++) {

                if (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9'){
                    charValue = Integer.parseInt(String.valueOf(inStr.charAt(i)));
                } else if (inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'z'){
                    charValue = Integer.parseInt(String.valueOf(inStr.charAt(i) - 'a' + 10));
                } else if (inStr.charAt(i) >= 'A' && inStr.charAt(i) <= 'Z'){
                    charValue = Integer.parseInt(String.valueOf(inStr.charAt(i) - 'A' + 10));
                }

                exp = Math.pow(radix, inStrLength - i - 1);
                equivalentDecimal = equivalentDecimal + exp * charValue;
                if (charValue >= radix) {
                    checkStr++;
                }
            }

            if (checkStr == 0) {
                System.out.println("The equivalent decimal number " + inStr + " is: " + (int) equivalentDecimal);
            } else {
                System.out.print("error: invalid radix" + radix + " string: " + inStr);
            }
        } else {
            System.out.println("Syntax error");
        }
    }
}
