import java.util.Scanner;

public class ExercisesOnMethod_2Dot3To2Dot10 {
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

    public static String arrayToString(int[] arr){
        String result = "";
        if (arr.length == 0){
            result = "The array is empty!";
        } else {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1){
                    result = result + arr[i] + "]";
                } else {
                    result = result + arr[i] + ", ";
                }
            }
        }
        return result;
    }

    public static boolean contains(int[] array, int key){
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static int search(int[] array, int key){
        int check = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                check = i;
                break;
            }
        }
        return check;
    }

    public static boolean equals(int[] array1, int[] array2){
        boolean check = true;
        if (array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]){
                    check = false;
                }
            }
        } else {
            check = false;
        }
        return check;
    }

    public static int[] copyOf(int[] oldArray){
        int[] newArray = new int[oldArray.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public static boolean swap(int[] array1, int[] array2){
        boolean check = false;
        int term;
        if (array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                term = array1[i];
                array1[i] = array2[i];
                array2[i] = term;
            }
            check = true;
        }
        return check;
    }

    public static void reverse(int[] oldArray) {
        int[] newArray = new int[oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[oldArray.length - i - 1];
        }
        swap(newArray,oldArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the elements of the first array: ");
        int NUMBER_LENGTHS1 = sc.nextInt();
        while (NUMBER_LENGTHS1 < 0){
            System.out.print("Enter the number of the elements of the first array: ");
            NUMBER_LENGTHS1 = sc.nextInt();
        }
        int[] array1 = new int[NUMBER_LENGTHS1];
        if (NUMBER_LENGTHS1 > 0) {
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < array1.length; i++) {
                array1[i] = sc.nextInt();
            }
        }
        System.out.print("Enter the number of the elements of the second array: ");
        int NUMBER_LENGTHS2 = sc.nextInt();
        while (NUMBER_LENGTHS2 < 0){
            System.out.print("Enter the number of the elements of the first array: ");
            NUMBER_LENGTHS2 = sc.nextInt();
        }
        int[] array2 = new int[NUMBER_LENGTHS2];
        if (NUMBER_LENGTHS2 > 0) {
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < array2.length; i++) {
                array2[i] = sc.nextInt();
            }
        }
        print(array1);
        System.out.println(arrayToString(array2));

        System.out.print("Enter the integer: ");
        int key = sc.nextInt();
        if (contains(array1,key)){
            System.out.println("array[" + search(array1,key) + "] = " + key);
        } else {
            System.out.println("The array contains the not given integer.");
        }

        if (equals(array1, array2)) {
            System.out.println("Array 1 is equal array 2!");
        } else {
            System.out.println("Array 1 is not equal array 2!");
        }
        int[] array3 = copyOf(array1);
        System.out.print("The reverse of array 2 is: ");
        reverse(array2);
        print(array2);
        System.out.print("The array 3 is : ");
        print(array3);
        sc.close();
    }
}
