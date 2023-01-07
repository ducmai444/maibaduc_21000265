public class SpecialSeries {
    public static double specialSeries(double x, int numTerms) {
        double frac = x;
        double res = x;
        for (int i = 1; i <= numTerms; i++) {
            frac = frac * (2 * i - 1) / (2 * i) * (2 * i - 1) / (2 * i + 1) * x * x;
            res += frac;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(specialSeries(0.5, 3745));
    }
}
