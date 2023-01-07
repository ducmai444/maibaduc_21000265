import java.util.Scanner;

public class PrintArrayInStars {

    public static void inputArray(int[] arr, Scanner sc) {
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
        }
    }

    public static void printArrayInStars(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+": ");
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.print("("+arr[i]+")");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();
        int[] items = new int[NUM_ITEMS];
        if (items.length > 0){
            inputArray(items, sc);
            printArrayInStars(items);
        } else {
            System.out.println("The array has no elements!");
        }
        sc.close();
    }
}

