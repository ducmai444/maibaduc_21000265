import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("a)");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println("b)");
        int sizeCol = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sizeCol; j++) {
                System.out.print("#");
            }
            sizeCol--;
            System.out.println();
        }

        System.out.println("c)");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= j){
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("d)");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i >= size - j){
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
