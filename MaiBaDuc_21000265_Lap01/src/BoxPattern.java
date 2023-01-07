import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("a)");
        for (int i = 0; i < size; i++) {
            if ( i > 0 && i < size - 1 ){
                for (int j = 0; j < size; j++) {
                    if ( j > 0 && j < size - 1 ){
                        System.out.print("  ");
                    }else {
                        System.out.print("# ");
                    }
                }
            } else {
                for (int j = 0; j < size; j++) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println("b)");
        for (int i = 0; i < size; i++) {
            if ( i > 0 && i < size - 1 ){
                for (int j = 0; j < size; j++) {
                    if ( i == j){
                        System.out.print("# ");
                    }else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 0; j < size; j++) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println("c)");
        for (int i = 0; i < size; i++) {
            if ( i > 0 && i < size - 1 ){
                for (int j = 0; j < size; j++) {
                    if ( size - i - 1 == j ){
                        System.out.print("# ");
                    }else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 0; j < size; j++) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println("d)");
        for (int i = 0; i < size; i++) {
            if ( i > 0 && i < size - 1 ){
                for (int j = 0; j < size; j++) {
                    if ( i == j){
                        System.out.print("# ");
                    } else if ( size - i - 1 == j) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 0; j < size; j++) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
