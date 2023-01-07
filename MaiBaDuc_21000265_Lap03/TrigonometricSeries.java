public class TrigonometricSeries {
    public static double sin(double x, int numTerms) {
        double res = x;
        double frac = x;
        for (int i = 1; i <= numTerms; i++) {
            frac = -frac / (2 * i) / (2 * i + 1) * x * x;
            res += frac;
        }
        return res;
    }

    public static double cos(double x, int numTerms) {
        double res = 1;
        double frac = 1;
        for (int i = 1; i <= numTerms; i++) {
            frac = -frac / (2 * i) / (2 * i - 1) * x * x;
            res += frac;
        }
        return res;
    }

    public static void main(String[] args) {
        int numTerms = 1000;
        System.out.println(sin(0, numTerms) + " " + Math.sin(0));
        System.out.println(sin(Math.PI / 6, numTerms) + " " + Math.sin(Math.PI / 6));
        System.out.println(sin(Math.PI / 4, numTerms) + " " + Math.sin(Math.PI / 4));
        System.out.println(sin(Math.PI / 3, numTerms) + " " + Math.sin(Math.PI / 3));
        System.out.println(sin(Math.PI / 2, numTerms) + " " + Math.sin(Math.PI / 2));

        System.out.println();

        System.out.println(cos(0, numTerms) + " " + Math.cos(0));
        System.out.println(cos(Math.PI / 6, numTerms) + " " + Math.cos(Math.PI / 6));
        System.out.println(cos(Math.PI / 4, numTerms) + " " + Math.cos(Math.PI / 4));
        System.out.println(cos(Math.PI / 3, numTerms) + " " + Math.cos(Math.PI / 3));
        System.out.println(cos(Math.PI / 2, numTerms) + " " + Math.cos(Math.PI / 2));
    }
}
