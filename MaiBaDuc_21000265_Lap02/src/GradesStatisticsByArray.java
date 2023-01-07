import java.util.Arrays;
import java.util.Scanner;

public class GradesStatisticsByArray {
    public static int[] grade;
    public static void readGrades(Scanner sc){
        System.out.print("Enter the number of the students: ");
        int SENTINEL = 0;
        int NUMBER_STUDENTS = sc.nextInt();
        while (NUMBER_STUDENTS < SENTINEL){
            System.out.print("Enter the number of students: ");
            NUMBER_STUDENTS = sc.nextInt();
        }
        grade = new int[NUMBER_STUDENTS];
        for (int i = 0; i < grade.length; i++) {
            System.out.print("Enter the grade for student " + i +" :");
            grade[i] = sc.nextInt();
            while (grade[i] < SENTINEL || grade[i] > 100) {
                System.out.print("Enter the grade for student " + i +" :");
                grade[i] = sc.nextInt();
            }
        }
    }

    public static void print(int[] arr){
        if (arr.length == 0){
            System.out.println("The array is empty!");
        } else {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1){
                    System.out.print(arr[i] + "]");
                } else {
                    System.out.print(arr[i] + ", ");
                }
            }
        }
        System.out.println();
    }

    public static double average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return Math.round(1.0 * sum / array.length * 100.00) / 100.00;
    }

    public static int min(int[] array){
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimum > array[i]){
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int max(int[] array){
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maximum < array[i]){
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static double median(int[] array){
        double med;
        int index;
        Arrays.sort(array);
        if (array.length % 2 == 1){
            med = array[array.length % 2 - 1];
        } else if (array.length == 0) {
            med = 0;
        } else {
            med = 1.0 * (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
        }
        return med;
    }

    public static double stdDev(int[] array){
        double sum = 0;
        double variance;
        for (int i = 0; i < array.length; i++) {
            sum = sum + (array[i] - average(array)) * (array[i] - average(array));
        }
        variance = 1.0 * sum / array.length;
        return Math.round(Math.sqrt(variance) * 100.00) / 100.00;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        readGrades(sc);
        System.out.println("The grades are: ");
        print(grade);
        System.out.println("The average is: " + average(grade));
        System.out.println("The median is: " + median(grade));
        System.out.println("The minimum is: " + min(grade));
        System.out.println("The maximum is: " + max(grade));
        System.out.println("The standard deviation is: " + stdDev(grade));
    }
}
