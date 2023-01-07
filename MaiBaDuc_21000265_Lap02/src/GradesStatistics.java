import java.util.Scanner;

public class GradesStatistics {

    public static void inputArray(int[] arr, Scanner sc){
        int studentNumber;
        for (int i = 0; i < arr.length; i++) {
            studentNumber = i + 1;
            System.out.print("Enter the grade for " + studentNumber + ": ");
            arr[i] = sc.nextInt();
            while (arr[i] < 0){
                System.out.println("Error: Grade value is negative!");
                System.out.print("Enter the grade for " + i + ": ");
                arr[i] = sc.nextInt();
            }
        }
    }

    public static void averageMinMaxArray(int[] arr){
        int sum = arr[0];
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        double average = 1.0 * sum / arr.length;
        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int NUMBER_STUDENT = sc.nextInt();
        int[] studentArray = new int[NUMBER_STUDENT];
        if (studentArray.length > 0){
            inputArray(studentArray, sc);
            averageMinMaxArray(studentArray);
        } else {
            System.out.println("Error: The number of students is negative!");
        }
        sc.close();
    }
}
