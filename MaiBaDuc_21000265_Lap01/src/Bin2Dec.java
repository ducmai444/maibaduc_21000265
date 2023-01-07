import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String inStr = sc.nextLine();
        inStr = inStr.toUpperCase();
        int equivalentDecimal = 0;

        int inStrLength = inStr.length();
        boolean isBinStr = true;

        for (int i = 0; i < inStrLength; i++) {
            if (!(inStr.charAt(i) == '0' )){
                if (!(inStr.charAt(i) == '1' )){
                    isBinStr = false;
                    break;
                }
            }
        }

        if (isBinStr){
            for (int i = 0; i < inStr.length(); i++) {
                if (inStr.charAt(i) == '1'){
                    equivalentDecimal = equivalentDecimal + (int) (Math.pow(2,inStrLength - i - 1));
                }
            }
        }

        if (isBinStr){
            System.out.println("The equivalent decimal number for binary " + inStr + " is: " + equivalentDecimal);
        } else {
            System.out.println("error : invalid binary string: " + inStr);
        }
    }
}
