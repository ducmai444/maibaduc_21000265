public class FactorialInt {
    public static void printFactorial() {
        int factorial = 1;
        int n = 0;
        while (Integer.MAX_VALUE / factorial >= n + 1) {
            n++;
            factorial *= n;
            System.out.println("The factorial of " + n + " is " + factorial);
        }
        System.out.println("The factorial of " + (n + 1) + " is out of range");
    }

    public static void main(String[] args) {
        printFactorial();
    }
}
