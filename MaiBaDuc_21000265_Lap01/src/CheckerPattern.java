import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (i % 2 == 1){
                System.out.print(" ");
            }
            for (int j = 0; j < size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        sc.close();
    }
}
