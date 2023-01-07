import java.util.Scanner;

public class MagicSum {
    public static boolean hasEight(int number){
        boolean check = false;
        number = Math.abs(number);
        while (number > 0){
            if (number % 10 == 8) {
                check = true;
                break;
            }
            number = number / 10;
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SENTINEL = -1;
        System.out.print("Enter a positive number (or -1 to end): ");
        int number = sc.nextInt();
        int sum = 0;
        while (number != SENTINEL){
            if (hasEight(number)){
                sum = sum + number;
            }
            System.out.print("Enter a positive number (or -1 to end): ");
            number = sc.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
        sc.close();
    }
}
