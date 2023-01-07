import java.util.Scanner;

public class Dec2Hex {
    public static boolean checkDecStr(String inStr){
        boolean checkDec = true;
        if (inStr.equals("")){
            checkDec = false;
        } else{
            for (int i = 0; i < inStr.length(); i++) {
                if (!(inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9')) {
                    checkDec = false;
                    break;
                }
            }
        }
        return checkDec;
    }

    public static void reverseStr(String decimalNumber, char[] result){
        int inStr = Integer.parseInt(decimalNumber);
        int index = 0;
        while (inStr > 0){
            if (inStr % 16 > 9){
                result[index] = (char) ('A' + (inStr % 16) - 10);
            } else {
                result[index] = (char) ('0' + (inStr % 16));
            }
            inStr = inStr / 16;
            index++;
        }
    }

    public static int countArraySize(String decimalNumber){
        int inStr = Integer.parseInt(decimalNumber);
        int count = 0;
        while (inStr > 0){
            inStr = inStr / 16;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String inStr = sc.nextLine();
        StringBuilder result = new StringBuilder();
        if (checkDecStr(inStr)){
            char[] reverseArray = new char[countArraySize(inStr)];
            reverseStr(inStr, reverseArray);
            for (int i = reverseArray.length - 1; i >= 0; i--) {
                result.append(reverseArray[i]);
            }
            System.out.println("The equivalent Hexadecimal number is: " + result);
        } else {
            System.out.println("Error: invalid positive Hexadecimal string: " + inStr);
        }
        sc.close();
    }
}
