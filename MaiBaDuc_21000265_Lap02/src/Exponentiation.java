import java.util.Scanner;

public class Exponentiation {
    public static int exponent(int base, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        if (exp >= 0){
            System.out.print(base + " raises to power of " + exp + " is: " + exponent(base, exp));
        } else {
            System.out.println("Syntax error: exponent is negative!");
        }
        sc.close();
    }
}
