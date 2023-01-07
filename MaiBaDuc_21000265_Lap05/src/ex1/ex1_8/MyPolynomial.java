package ex1.ex1_8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (i == 0) {
                result = result + Math.round(coeffs[i] * 100.00) / 100.00;
            } else {
                result = result + Math.round(coeffs[i] * 100.00) / 100.00 + "x^" + i + " + ";
            }

        }
        return result;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result = result + coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        if (this.coeffs.length > right.coeffs.length) {
            for (int i = 0; i < right.coeffs.length; i++) {
                this.coeffs[i] = this.coeffs[i] + right.coeffs[i];
            }
        } else {
            for (int i = 0; i < this.coeffs.length; i++) {
                this.coeffs[i] = this.coeffs[i] + right.coeffs[i];
            }
        }
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] term = new double[(this.coeffs.length - 1) + (right.coeffs.length - 1) + 1];
        for (int i = 0; i < term.length; i++) {
            term[i] = 0;
            for (int j = 0; j <= i; j++) {
                if (j < this.coeffs.length && i - j < right.coeffs.length) {
                    term[i] = term[i] + this.coeffs[j] * right.coeffs[i - j];
                }
            }
            term[i] = Math.round(term[i] * 100.00) / 100.00;
        }
        this.coeffs = new double[(term.length)];
        this.coeffs = term;
        return this;
    }
}
