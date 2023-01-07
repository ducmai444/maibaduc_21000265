package ex1.ex1_8;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println(p1);
        p1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);

        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial p2 = new MyPolynomial(coeffs);

        System.out.println(p1);
        System.out.println(p1.getDegree());
        System.out.println(p1.evaluate(0.5));
        System.out.println(p2);
        System.out.println(p1.add(p2));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.multiply(p2));
    }
}
