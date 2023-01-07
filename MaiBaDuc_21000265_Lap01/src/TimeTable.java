import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        System.out.printf("%4s","* |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4s", i);
        }
        System.out.println();
        for (int i = 0; i < size * 5 + 4; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <= size ; i++) {
            System.out.printf("%4s",i + " | ");
            for (int j = 1; j <= size ; j++) {
                System.out.printf("%4s", i * j);
            }
            System.out.println();
        }

        
    }
}
