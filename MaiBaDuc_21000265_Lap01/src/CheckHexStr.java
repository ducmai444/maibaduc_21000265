import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a plaintext string: ");
        String inStr = sc.nextLine();
        inStr = inStr.toUpperCase();
        int inStrLength = inStr.length();
        boolean isHexStr = true;
        sc.close();

        for (int i = 0; i < inStrLength; i++) {
            if (!(inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9')){
                if (!(inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'f')){
                    if (!(inStr.charAt(i) >= 'A' && inStr.charAt(i) <= 'F')){
                        isHexStr = false;
                        break;
                    }
                }
            }
        }

        if (isHexStr){
            System.out.println(inStr + " is a hex string!");
        } else {
            System.out.println(inStr + " is NOT a hex string!");
        }
    }
}
