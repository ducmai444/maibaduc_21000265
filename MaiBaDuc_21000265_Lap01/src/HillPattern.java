import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("a)");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2 * size + 1; j++) {
                if ( j >= size - i && j <= size + i){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("b)");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2 * size + 1; j++) {
                if ( j >= i + 1 && j <= 2 * size - i - 1){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("c)");
        for (int i = 0; i < 2 * size - 1; i++) {
            if (i < size){
                for (int j = 0; j < 2 * size + 1; j++) {
                    if ( j >= size - i && j <= size + i){
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 0; j < 2 * size + 1; j++) {
                    if ( j >= i - size + 2 && j <= 3 * size - i - 2){
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("d)");
        for (int i = 0; i < 2 * size - 1; i++) {
            if (i < size){
                for (int j = 0; j < 2 * size - 1; j++) {
                    if ( j <= size - i - 1){
                        System.out.print("# ");
                    } else if (j >= size + i - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 0; j < 2 * size - 1; j++) {
                    if ( j <= i - size + 1){
                        System.out.print("# ");
                    } else if (j >= 3 * size - i - 3) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
